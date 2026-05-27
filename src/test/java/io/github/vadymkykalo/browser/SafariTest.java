package io.github.vadymkykalo.browser;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SafariTest {

    private final List<Object[]> entries = new ArrayList<>();

    @BeforeTest
    public void setUp() throws Exception {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("safari.txt").getFile());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, "\t");

                String userAgent = tokenizer.nextToken();
                String type = tokenizer.nextToken();
                String browser = tokenizer.nextToken();
                String version = tokenizer.nextToken();

                entries.add(new Object[] {userAgent, type, browser, version});
            }
        }
    }

    @DataProvider
    public Object[][] getSafariData() {
        return entries.toArray(new Object[entries.size()][]);
    }

    @Test(dataProvider = "getSafariData")
    public void testSafariUserAgent(String userAgent, String type, String browserName, String version) {
        Browser browser = new Browser(userAgent);
        Assert.assertEquals(browserName, browser.getBrowser());
        Assert.assertEquals(version, browser.getVersion());
    }

    /**
     * Regression test for StringIndexOutOfBoundsException when User-Agent
     * contains "Safari" but does not contain "Version" token.
     * See: https://github.com/vadymkykalo/Browser.java/issues - reported via Sentry on m4you facade.
     */
    @Test
    public void testSafariWithoutVersionTokenDoesNotThrow() {
        String ua = "Mozilla/5.0 (Mac OS X 13_2) AppleWebKit/537.36 (KHTML, like Gecko) Safari/103.0 Safari/537.36";
        Browser browser = new Browser(ua);
        Assert.assertEquals(Browser.BROWSER_SAFARI, browser.getBrowser());
        Assert.assertEquals(Browser.VERSION_UNKNOWN, browser.getVersion());
    }
}
