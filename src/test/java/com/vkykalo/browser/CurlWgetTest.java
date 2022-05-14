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
        List<String> curlFirst = new ArrayList<>();
        curlFirst.add("curl/7.37.1");
        curlFirst.add(Browser.BROWSER_CURL);
        curlFirst.add("7.37.1");
        List<String> curlSecond = new ArrayList<>();
        curlSecond.add("Wget/1.16 (darwin14.0.0)");
        curlSecond.add(Browser.BROWSER_CURL);
        curlSecond.add("1.16");
        data.add(curlFirst);
        data.add(curlSecond);
    }

    @Test
    public void testCurlWgetUserAgent() {
        for (List<String> row : data) {
            Browser browser = new Browser(row.get(0));
            Assert.assertEquals(row.get(2), browser.getBrowser());
        }
    }
}
