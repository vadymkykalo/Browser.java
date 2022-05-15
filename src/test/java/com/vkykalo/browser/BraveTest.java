package com.vkykalo.browser;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class BraveTest {

    private final List<Object[]> entries = new ArrayList<>();

    @BeforeTest
    public void setUp() throws Exception {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("brave.txt").getFile());
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
    public Object[][] getBraveData() {
        return entries.toArray(new Object[entries.size()][]);
    }

    @Test(dataProvider = "getBraveData")
    public void testBraveUserAgent(String userAgent, String type, String browserName, String version) {
        Browser browser = new Browser(userAgent);
        Assert.assertEquals(browserName, browser.getBrowser());
        Assert.assertEquals(version, browser.getVersion());
    }
}
