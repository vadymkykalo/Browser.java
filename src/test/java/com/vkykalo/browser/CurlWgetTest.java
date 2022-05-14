package com.vkykalo.browser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CurlWgetTest {

    private final List<List<String>> data = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        List<String> curl = new ArrayList<>();
        curl.add("curl/7.37.1");
        curl.add(Browser.BROWSER_CURL);
        curl.add("7.37.1");

        List<String> wget = new ArrayList<>();
        wget.add("Wget/1.16 (darwin14.0.0)");
        wget.add(Browser.BROWSER_WGET);
        wget.add("1.16");

        data.add(curl);
        data.add(wget);
    }

    @Test
    public void testWgetUserAgent() {
        List<String> wget = data.get(0);
        Browser browser = new Browser(wget.get(0));
        Assert.assertEquals(wget.get(1), browser.getBrowser());
        Assert.assertEquals(wget.get(2), browser.getVersion());
    }

    @Test
    public void testCurlUserAgent() {
        List<String> curl = data.get(0);
        Browser browser = new Browser(curl.get(0));
        Assert.assertEquals(curl.get(1), browser.getBrowser());
        Assert.assertEquals(curl.get(2), browser.getVersion());
    }
}
