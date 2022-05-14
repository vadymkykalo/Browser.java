package com.vkykalo.browser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UCBrowserTest {

    private final List<List<String>> data = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("ucbrowser.txt").getFile());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, "\t");
                List<String> tokens = new ArrayList<>();
                while(tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    tokens.add(token);
                }
                data.add(tokens);
            }
        }
    }

    @Test
    public void testUCBrowserUserAgent() {
        for (List<String> row : data) {
            Browser browser = new Browser(row.get(0));

            Assert.assertEquals(row.get(2), browser.getBrowser());
            Assert.assertEquals(row.get(3), browser.getVersion());
        }
    }
}
