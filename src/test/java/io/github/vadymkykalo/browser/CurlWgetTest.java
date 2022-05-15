package io.github.vadymkykalo.browser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CurlWgetTest {

    @DataProvider
    public Object[][] getCurlWgetData() {
        return new Object[][] {
                {"curl/7.37.1", "Browser", Browser.BROWSER_CURL, "7.37.1"},
                {"Wget/1.16 (darwin14.0.0)", "Browser", Browser.BROWSER_WGET, "1.16"}
        };
    }

    @Test(dataProvider = "getCurlWgetData")
    public void testCurlWgetUserAgent(String userAgent, String type, String browserName, String version) {
        Browser browser = new Browser(userAgent);
        Assert.assertEquals(browserName, browser.getBrowser());
        Assert.assertEquals(version, browser.getVersion());
    }
}
