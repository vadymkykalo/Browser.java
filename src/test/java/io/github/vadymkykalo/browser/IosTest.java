package io.github.vadymkykalo.browser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IosTest {

    @DataProvider
    public Object[][] iosAgents() {
        return new Object[][] {
            {"Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.5 Mobile/15E148 Safari/604.1",
                Browser.BROWSER_SAFARI, "17.5", true, false},
            {"Mozilla/5.0 (iPad; CPU OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.5 Mobile/15E148 Safari/604.1",
                Browser.BROWSER_SAFARI, "17.5", false, true},
            {"Mozilla/5.0 (iPod touch; CPU iPhone OS 15_7 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/15.6 Mobile/15E148 Safari/604.1",
                Browser.BROWSER_SAFARI, "15.6", true, false},
            {"Mozilla/5.0 (iPhone; CPU iPhone OS 17_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) CriOS/126.0.6478.54 Mobile/15E148 Safari/604.1",
                Browser.BROWSER_CHROME, "126.0.6478.54", true, false},
        };
    }

    @Test(dataProvider = "iosAgents")
    public void anIosDeviceReportsTheBrowserAndIosAsThePlatform(String userAgent, String browser, String version,
                                                                boolean mobile, boolean tablet) {
        Browser b = new Browser(userAgent);
        Assert.assertEquals(b.getBrowser(), browser);
        Assert.assertEquals(b.getVersion(), version);
        Assert.assertEquals(b.getPlatform(), Browser.PLATFORM_IOS);
        Assert.assertEquals(b.isMobile(), mobile);
        Assert.assertEquals(b.isTablet(), tablet);
    }
}
