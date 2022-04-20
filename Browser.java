
public class Browser {

    private java.lang.String userAgent = "";
    private java.lang.String browserName = "";
    private java.lang.String version = "";
    private java.lang.String platform = "";
    private java.lang.String os = "";
    private java.lang.Boolean isAol = false;
    private java.lang.Boolean isMobile = false;
    private java.lang.Boolean isTablet = false;
    private java.lang.Boolean isRobot = false;
    private java.lang.Boolean isFacebook = false;
    private java.lang.String aolVersion = "";

    public static final java.lang.String BROWSER_UNKNOWN = "unknown";
    public static final java.lang.String VERSION_UNKNOWN = "unknown";

    public static final java.lang.String BROWSER_OPERA = "Opera"; // http://www.opera.com/
    public static final java.lang.String BROWSER_OPERA_MINI = "Opera Mini"; // http://www.opera.com/mini/
    public static final java.lang.String BROWSER_WEBTV = "WebTV"; // http://www.webtv.net/pc/
    public static final java.lang.String BROWSER_EDGE = "Edge"; // https://www.microsoft.com/edge
    public static final java.lang.String BROWSER_IE = "Internet Explorer"; // http://www.microsoft.com/ie/
    public static final java.lang.String BROWSER_POCKET_IE = "Pocket Internet Explorer"; // http://en.wikipedia.org/wiki/Internet_Explorer_Mobile
    public static final java.lang.String BROWSER_KONQUEROR = "Konqueror"; // http://www.konqueror.org/
    public static final java.lang.String BROWSER_ICAB = "iCab"; // http://www.icab.de/
    public static final java.lang.String BROWSER_OMNIWEB = "OmniWeb"; // http://www.omnigroup.com/applications/omniweb/
    public static final java.lang.String BROWSER_FIREBIRD = "Firebird"; // http://www.ibphoenix.com/
    public static final java.lang.String BROWSER_FIREFOX = "Firefox"; // https://www.mozilla.org/en-US/firefox/
    public static final java.lang.String BROWSER_BRAVE = "Brave"; // https://brave.com/
    public static final java.lang.String BROWSER_PALEMOON = "Palemoon"; // https://www.palemoon.org/
    public static final java.lang.String BROWSER_ICEWEASEL = "Iceweasel"; // http://www.geticeweasel.org/
    public static final java.lang.String BROWSER_SHIRETOKO = "Shiretoko"; // http://wiki.mozilla.org/Projects/shiretoko
    public static final java.lang.String BROWSER_MOZILLA = "Mozilla"; // http://www.mozilla.com/en-US/
    public static final java.lang.String BROWSER_AMAYA = "Amaya"; // http://www.w3.org/Amaya/
    public static final java.lang.String BROWSER_LYNX = "Lynx"; // http://en.wikipedia.org/wiki/Lynx
    public static final java.lang.String BROWSER_SAFARI = "Safari"; // http://apple.com
    public static final java.lang.String BROWSER_IPHONE = "iPhone"; // http://apple.com
    public static final java.lang.String BROWSER_IPOD = "iPod"; // http://apple.com
    public static final java.lang.String BROWSER_IPAD = "iPad"; // http://apple.com
    public static final java.lang.String BROWSER_CHROME = "Chrome"; // http://www.google.com/chrome
    public static final java.lang.String BROWSER_ANDROID = "Android"; // http://www.android.com/
    public static final java.lang.String BROWSER_GOOGLEBOT = "GoogleBot"; // http://en.wikipedia.org/wiki/Googlebot
    public static final java.lang.String BROWSER_CURL = "cURL"; // https://en.wikipedia.org/wiki/CURL
    public static final java.lang.String BROWSER_WGET = "Wget"; // https://en.wikipedia.org/wiki/Wget
    public static final java.lang.String BROWSER_UCBROWSER = "UCBrowser"; // https://www.ucweb.com/

    public static final java.lang.String BROWSER_YANDEXBOT = "YandexBot"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXIMAGERESIZER_BOT = "YandexImageResizer"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXIMAGES_BOT = "YandexImages"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXVIDEO_BOT = "YandexVideo"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXMEDIA_BOT = "YandexMedia"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXBLOGS_BOT = "YandexBlogs"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXFAVICONS_BOT = "YandexFavicons"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXWEBMASTER_BOT = "YandexWebmaster"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXDIRECT_BOT = "YandexDirect"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXMETRIKA_BOT = "YandexMetrika"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXNEWS_BOT = "YandexNews"; // http://yandex.com/bots
    public static final java.lang.String BROWSER_YANDEXCATALOG_BOT = "YandexCatalog"; // http://yandex.com/bots

    public static final java.lang.String BROWSER_SLURP = "Yahoo! Slurp"; // http://en.wikipedia.org/wiki/Yahoo!_Slurp
    public static final java.lang.String BROWSER_W3CVALIDATOR = "W3C Validator"; // http://validator.w3.org/
    public static final java.lang.String BROWSER_BLACKBERRY = "BlackBerry"; // http://www.blackberry.com/
    public static final java.lang.String BROWSER_ICECAT = "IceCat"; // http://en.wikipedia.org/wiki/GNU_IceCat
    public static final java.lang.String BROWSER_NOKIA_S60 = "Nokia S60 OSS Browser"; // http://en.wikipedia.org/wiki/Web_Browser_for_S60
    public static final java.lang.String BROWSER_NOKIA = "Nokia Browser"; // * all other WAP-based browsers on the Nokia Platform
    public static final java.lang.String BROWSER_MSN = "MSN Browser"; // http://explorer.msn.com/
    public static final java.lang.String BROWSER_MSNBOT = "MSN Bot"; // http://search.msn.com/msnbot.htm
    public static final java.lang.String BROWSER_BINGBOT = "Bing Bot"; // http://en.wikipedia.org/wiki/Bingbot
    public static final java.lang.String BROWSER_VIVALDI = "Vivaldi"; // https://vivaldi.com/
    public static final java.lang.String BROWSER_YANDEX = "Yandex"; // https://browser.yandex.ua/

    public static final java.lang.String BROWSER_NETSCAPE_NAVIGATOR = "Netscape Navigator"; // http://browser.netscape.com/ (DEPRECATED)
    public static final java.lang.String BROWSER_GALEON = "Galeon"; // http://galeon.sourceforge.net/ (DEPRECATED)
    public static final java.lang.String BROWSER_NETPOSITIVE = "NetPositive"; // http://en.wikipedia.org/wiki/NetPositive (DEPRECATED)
    public static final java.lang.String BROWSER_PHOENIX = "Phoenix"; // http://en.wikipedia.org/wiki/History_of_Mozilla_Firefox (DEPRECATED)
    public static final java.lang.String BROWSER_PLAYSTATION = "PlayStation";
    public static final java.lang.String BROWSER_SAMSUNG = "SamsungBrowser";
    public static final java.lang.String BROWSER_SILK = "Silk";
    public static final java.lang.String BROWSER_I_FRAME = "Iframely";
    public static final java.lang.String BROWSER_COCOA = "CocoaRestClient";

    public static final java.lang.String PLATFORM_UNKNOWN = "unknown";
    public static final java.lang.String PLATFORM_WINDOWS = "Windows";
    public static final java.lang.String PLATFORM_WINDOWS_CE = "Windows CE";
    public static final java.lang.String PLATFORM_APPLE = "Apple";
    public static final java.lang.String PLATFORM_LINUX = "Linux";
    public static final java.lang.String PLATFORM_OS2 = "OS/2";
    public static final java.lang.String PLATFORM_BEOS = "BeOS";
    public static final java.lang.String PLATFORM_IPHONE = "iPhone";
    public static final java.lang.String PLATFORM_IPOD = "iPod";
    public static final java.lang.String PLATFORM_IPAD = "iPad";
    public static final java.lang.String PLATFORM_BLACKBERRY = "BlackBerry";
    public static final java.lang.String PLATFORM_NOKIA = "Nokia";
    public static final java.lang.String PLATFORM_FREEBSD = "FreeBSD";
    public static final java.lang.String PLATFORM_OPENBSD = "OpenBSD";
    public static final java.lang.String PLATFORM_NETBSD = "NetBSD";
    public static final java.lang.String PLATFORM_SUNOS = "SunOS";
    public static final java.lang.String PLATFORM_OPENSOLARIS = "OpenSolaris";
    public static final java.lang.String PLATFORM_ANDROID = "Android";
    public static final java.lang.String PLATFORM_PLAYSTATION = "Sony PlayStation";
    public static final java.lang.String PLATFORM_ROKU = "Roku";
    public static final java.lang.String PLATFORM_APPLE_TV = "Apple TV";
    public static final java.lang.String PLATFORM_TERMINAL = "Terminal";
    public static final java.lang.String PLATFORM_FIRE_OS = "Fire OS";
    public static final java.lang.String PLATFORM_SMART_TV = "SMART-TV";
    public static final java.lang.String PLATFORM_CHROME_OS = "Chrome OS";
    public static final java.lang.String PLATFORM_JAVA_ANDROID = "Java/Android";
    public static final java.lang.String PLATFORM_POSTMAN = "Postman";
    public static final java.lang.String PLATFORM_I_FRAME = "Iframely";

    public static final java.lang.String OPERATING_SYSTEM_UNKNOWN = "unknown";

    public Browser () {
        this.reset();
        this.determine();
    }

    public Browser (java.lang.String userAgent) {
        this.setUserAgent(userAgent);
    }

    /**
     * Reset all properties
     */
    public void reset() {
        this.userAgent = "";
        this.browserName = BROWSER_UNKNOWN;
        this.version = VERSION_UNKNOWN;
        this.platform = PLATFORM_UNKNOWN;
        this.os = OPERATING_SYSTEM_UNKNOWN;
        this.isAol = false;
        this.isMobile = false;
        this.isTablet = false;
        this.isRobot = false;
        this.isFacebook = false;
        this.aolVersion = VERSION_UNKNOWN;
    }

    /**
     * Check to see if the specific browser is valid
     * @param browserName
     * @return bool True if the browser is the specified browser
     */
    public java.lang.Boolean isBrowser(java.lang.String browserName) {
        return this.browserName.equals(browserName.trim());
    }

    /**
     * The name of the browser.  All return types are from the class contants
     * @return string Name of the browser
     */
    public java.lang.String getBrowser() {
        return this.browserName;
    }

    /**
     * Set the name of the browser
     * @param browser string The name of the Browser
     */
    public void setBrowser(java.lang.String browser) {
        this.browserName = browser;
    }

    /**
     * The name of the platform.  All return types are from the class contants
     * @return string Name of the browser
     */
    public java.lang.String getPlatform() {
        return this.platform;
    }

    /**
     * Set the name of the platform
     * @param platform The name of the Platform
     */
    public void setPlatform(java.lang.String platform) {
        this.platform = platform;
    }

    /**
     * The version of the browser.
     * @return string Version of the browser (will only contain alpha-numeric characters and a period)
     */
    public java.lang.String getVersion() {
        return this.version;
    }

    /**
     * Set the version of the browser
     * @param version The version of the Browser
     */
    public void setVersion(java.lang.String version) {
        this.version = version.replaceAll("/[^0-9,.,a-z,A-Z-]/", "");
    }

    /**
     * The version of AOL.
     * @return string Version of AOL (will only contain alpha-numeric characters and a period)
     */
    public java.lang.String getAolVersion() {
        return this.aolVersion;
    }

    /**
     * Set the version of AOL
     * @param version The version of AOL
     */
    public void setAolVersion(java.lang.String version) {
        this.aolVersion = version.replaceAll("/[^0-9,.,a-z,A-Z-]/", "");
    }

    /**
     * Is the browser from AOL?
     * @return boolean True if the browser is from AOL otherwise false
     */
    public java.lang.Boolean isAol() {
        return this.isAol;
    }

    /**
     * Is the browser from a mobile device?
     * @return boolean True if the browser is from a mobile device otherwise false
     */
    public java.lang.Boolean isMobile() {
        return this.isMobile;
    }

    /**
     * Is the browser from a tablet device?
     * @return boolean True if the browser is from a tablet device otherwise false
     */
    public java.lang.Boolean isTablet() {
        return this.isTablet;
    }

    /**
     * Is the browser from a robot (ex Slurp,GoogleBot)?
     * @return boolean True if the browser is from a robot otherwise false
     */
    public java.lang.Boolean isRobot() {
        return this.isRobot;
    }

    /**
     * Is the browser from facebook?
     * @return boolean True if the browser is from facebook otherwise false
     */
    public java.lang.Boolean isFacebook() {
        return this.isFacebook;
    }

    /**
     * Set the browser to be from AOL
     * @param isAol
     */
    public void setAol(java.lang.Boolean isAol) {
        this.isAol = isAol;
    }

    /**
     * Set the Browser to be mobile
     * @param value is the browser a mobile browser or not
     */
    protected void setMobile(java.lang.Boolean value) {
        if (null == value) {
            value = true;
        }

        this.isMobile = value;
    }

    /**
     * Set the Browser to be tablet
     * @param value is the browser a tablet browser or not
     */
    protected void setTablet(java.lang.Boolean value) {
        if (null == value) {
            value = true;
        }

        this.isTablet = value;
    }

    /**
     * Set the Browser to be a robot
     * @param value is the browser a robot or not
     */
    protected void setRobot(java.lang.Boolean value) {
        if (null == value) {
            value = true;
        }

        this.isRobot = value;
    }

    /**
     * Set the Browser to be a Facebook request
     * @param value is the browser a robot or not
     */
    protected void setFacebook(java.lang.Boolean value) {
        if (null == value) {
            value = true;
        }

        this.isFacebook = value;
    }

    /**
     * Get the user agent value in use to determine the browser
     * @return string The user agent from the HTTP header
     */
    public java.lang.String getUserAgent() {
        return this.userAgent;
    }

    /**
     * Set the user agent value (the construction will use the HTTP header value - this will overwrite it)
     * @param agentString The value for the User Agent
     */
    public void setUserAgent(java.lang.String agentString) {
        this.reset();
        this.userAgent = agentString;
        this.determine();
    }

    /**
     * Used to determine if the browser is actually "chromeframe"
     * @return boolean True if the browser is using chromeframe
     */
    public java.lang.Boolean isChromeFrame() {
        return containsIgnoreCase(this.userAgent, "chromeframe");
    }

    /**
     * Returns a formatted string with a summary of the details of the browser.
     * @return string formatted string with a summary of the browser
     */
    @Override
    public java.lang.String toString() {
        return "Browser Name: " + this.getBrowser() + " \n" +
        "Browser Version: " + this.getVersion() + " \n" +
        "Browser User Agent String: " + this.getUserAgent() + " \n" +
        "Platform: " + this.getPlatform();
    }

    /**
     * Protected routine to calculate and determine what the browser is in use (including platform)
     */
    protected void determine() {
        this.checkPlatform();
        this.checkBrowsers();
        this.checkForAol();
    }

    /**
     * Protected routine to determine the browser type
     * @return boolean True if the browser was detected otherwise false
     */
    protected java.lang.Boolean checkBrowsers() {
        // well-known, well-used
        // Special Notes:
        // (1) Opera must be checked before FireFox due to the odd
        //     user agents used in some older versions of Opera
        // (2) WebTV is strapped onto Internet Explorer so we must
        //     check for WebTV before IE
        // (3) (deprecated) Galeon is based on Firefox and needs to be
        //     tested before Firefox is tested
        // (4) OmniWeb is based on Safari so OmniWeb check must occur
        //     before Safari
        // (5) Netscape 9+ is based on Firefox so Netscape checks
        //     before FireFox are necessary
        // (6) Vivaldi is UA contains both Firefox and Chrome so Vivaldi checks
        //     before Firefox and Chrome
        return
                this.checkBrowserWebTv() ||
                this.checkBrowserBrave() ||
                this.checkBrowserUCBrowser() ||
                this.checkBrowserEdge() ||
                this.checkBrowserInternetExplorer() ||
                this.checkBrowserOpera() ||
                this.checkBrowserGaleon() ||
                this.checkBrowserNetscapeNavigator9Plus() ||
                this.checkBrowserVivaldi() ||
                this.checkBrowserYandex() ||
                this.checkBrowserPalemoon() ||
                this.checkBrowserFirefox() ||
                this.checkBrowserChrome() ||
                this.checkBrowserOmniWeb() ||

                // common mobile
                this.checkBrowserAndroid() ||
                this.checkBrowseriPad() ||
                this.checkBrowseriPod() ||
                this.checkBrowseriPhone() ||
                this.checkBrowserBlackBerry() ||
                this.checkBrowserNokia() ||

                // common bots
                this.checkBrowserGoogleBot() ||
                this.checkBrowserMSNBot() ||
                this.checkBrowserBingBot() ||
                this.checkBrowserSlurp() ||

                // Yandex bots
                this.checkBrowserYandexBot() ||
                this.checkBrowserYandexImageResizerBot() ||
                this.checkBrowserYandexBlogsBot() ||
                this.checkBrowserYandexCatalogBot() ||
                this.checkBrowserYandexDirectBot() ||
                this.checkBrowserYandexFaviconsBot() ||
                this.checkBrowserYandexImagesBot() ||
                this.checkBrowserYandexMediaBot() ||
                this.checkBrowserYandexMetrikaBot() ||
                this.checkBrowserYandexNewsBot() ||
                this.checkBrowserYandexVideoBot() ||
                this.checkBrowserYandexWebmasterBot() ||
                // check for facebook external hit when loading URL
                this.checkFacebookExternalHit() ||
                // WebKit base check (post mobile and others)
                this.checkBrowserSamsung() ||
                this.checkBrowserSilk() ||
                this.checkBrowserSafari() ||
                // everyone else
                this.checkBrowserNetPositive() ||
                this.checkBrowserFirebird() ||
                this.checkBrowserKonqueror() ||
                this.checkBrowserIcab() ||
                this.checkBrowserPhoenix() ||
                this.checkBrowserAmaya() ||
                this.checkBrowserLynx() ||
                this.checkBrowserShiretoko() ||
                this.checkBrowserIceCat() ||
                this.checkBrowserIceweasel() ||
                this.checkBrowserW3CValidator() ||
                this.checkBrowserCurl() ||
                this.checkBrowserWget() ||
                this.checkBrowserPlayStation() ||
                this.checkBrowserIframely() ||
                this.checkBrowserCocoa() ||
                this.checkBrowserMozilla();
        /* Mozilla is such an open standard that you must check it last */
    }

    /**
     * Determine if the user is using a BlackBerry (last updated 1.7)
     * @return boolean True if the browser is the BlackBerry browser otherwise false
     */
    protected java.lang.Boolean checkBrowserBlackBerry() {
        if (containsIgnoreCase(this.userAgent, "blackberry")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("BlackBerry".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] version = result[1].split(" ");
                this.setVersion(version[0]);
                this.browserName = BROWSER_BLACKBERRY;
                this.setMobile(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the user is using an AOL User Agent (last updated 1.7)
     * @return boolean True if the browser is from AOL otherwise false
     */
    protected java.lang.Boolean checkForAol() {
        this.setAol(false);
        this.setAolVersion(VERSION_UNKNOWN);
        if (containsIgnoreCase(this.userAgent, "aol")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("AOL".toLowerCase())).split(" ");
            if (result.length >= 2) {
                this.setAol(true);
                this.setAolVersion(result[1].replaceAll("/[^0-9\\.a-z]/i", ""));
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the GoogleBot or not (last updated 1.7)
     * @return boolean True if the browser is the GoogletBot otherwise false
     */
    protected java.lang.Boolean checkBrowserGoogleBot() {
        if (containsIgnoreCase(this.userAgent, "googlebot")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("googlebot".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_GOOGLEBOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexBot or not
     * @return boolean True if the browser is the YandexBot otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexBot() {
        if (containsIgnoreCase(this.userAgent, "YandexBot")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexBot".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXBOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexImageResizer or not
     * @return boolean True if the browser is the YandexImageResizer otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexImageResizerBot() {
        if (containsIgnoreCase(this.userAgent, "YandexImageResizer")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexImageResizer".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXIMAGERESIZER_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexCatalog or not
     * @return boolean True if the browser is the YandexCatalog otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexCatalogBot() {
        if (containsIgnoreCase(this.userAgent, "YandexCatalog")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexCatalog".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXCATALOG_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexNews or not
     * @return boolean True if the browser is the YandexNews otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexNewsBot() {
        if (containsIgnoreCase(this.userAgent, "YandexNews")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexNews".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXNEWS_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexMetrika or not
     * @return boolean True if the browser is the YandexMetrika otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexMetrikaBot() {
        if (containsIgnoreCase(this.userAgent, "YandexMetrika")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexMetrika".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXMETRIKA_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexDirect or not
     * @return boolean True if the browser is the YandexDirect otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexDirectBot() {
        if (containsIgnoreCase(this.userAgent, "YandexDirect")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexDirect".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXDIRECT_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexWebmaster or not
     * @return boolean True if the browser is the YandexWebmaster otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexWebmasterBot() {
        if (containsIgnoreCase(this.userAgent, "YandexWebmaster")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexWebmaster".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXWEBMASTER_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexFavicons or not
     * @return boolean True if the browser is the YandexFavicons otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexFaviconsBot() {
        if (containsIgnoreCase(this.userAgent, "YandexFavicons")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexFavicons".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXFAVICONS_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexBlogs or not
     * @return boolean True if the browser is the YandexBlogs otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexBlogsBot() {
        if (containsIgnoreCase(this.userAgent, "YandexBlogs")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexBlogs".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXBLOGS_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexMedia or not
     * @return boolean True if the browser is the YandexMedia otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexMediaBot() {
        if (containsIgnoreCase(this.userAgent, "YandexMedia")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexMedia".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXMEDIA_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexVideo or not
     * @return boolean True if the browser is the YandexVideo otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexVideoBot() {
        if (containsIgnoreCase(this.userAgent, "YandexVideo")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexVideo".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXVIDEO_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the YandexImages or not
     * @return boolean True if the browser is the YandexImages otherwise false
     */
    protected java.lang.Boolean checkBrowserYandexImagesBot() {
        if (containsIgnoreCase(this.userAgent, "YandexImages")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("YandexImages".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_YANDEXIMAGES_BOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the MSNBot or not (last updated 1.9)
     * @return boolean True if the browser is the MSNBot otherwise false
     */
    protected java.lang.Boolean checkBrowserMSNBot() {
        if (containsIgnoreCase(this.userAgent, "msnbot")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("msnbot".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_MSNBOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the BingBot or not (last updated 1.9)
     * @return boolean True if the browser is the BingBot otherwise false
     */
    protected java.lang.Boolean checkBrowserBingBot() {
        if (containsIgnoreCase(this.userAgent, "bingbot")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("bingbot".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace(";", ""));
                this.browserName = BROWSER_BINGBOT;
                this.setRobot(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is the W3C Validator or not (last updated 1.7)
     * @return boolean True if the browser is the W3C Validator otherwise false
     */
    protected java.lang.Boolean checkBrowserW3CValidator() {
        if (containsIgnoreCase(this.userAgent, "W3C-checklink")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("W3C-checklink".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.browserName = BROWSER_W3CVALIDATOR;
                return true;
            }
        } else if (containsIgnoreCase(this.userAgent, "W3C_Validator")) {
            // Some of the Validator versions do not delineate w/ a slash - add it back in
            java.lang.String ua = this.userAgent.replace("W3C_Validator ", "W3C_Validator/");
            java.lang.String[] result = ua.substring(ua.toLowerCase().indexOf("W3C_Validator".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.browserName = BROWSER_W3CVALIDATOR;
                return true;
            }
        } else if (containsIgnoreCase(this.userAgent, "W3C-mobileOK")) {
            this.browserName = BROWSER_W3CVALIDATOR;
            this.setMobile(true);
            return true;
        }
        return false;
    }

    /**
     * Determine if the browser is the Yahoo! Slurp Robot or not (last updated 1.7)
     * @return boolean True if the browser is the Yahoo! Slurp Robot otherwise false
     */
    protected java.lang.Boolean checkBrowserSlurp() {
        if (containsIgnoreCase(this.userAgent, "slurp")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("slurp".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.browserName = BROWSER_SLURP;
                this.setRobot(true);
                this.setMobile(false);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is Brave or not
     * @return boolean True if the browser is Brave otherwise false
     */
    protected java.lang.Boolean checkBrowserBrave() {
        if (containsIgnoreCase(this.userAgent, "Brave/")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("Brave".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.browserName = BROWSER_BRAVE;
                return true;
            }
        } else if (containsIgnoreCase(this.userAgent, " Brave ")) {
            this.setBrowser(BROWSER_BRAVE);
            // this version of the UA did not ship with a version marker
            // e.g. Mozilla/5.0 (Linux; Android 7.0; SM-G955F Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Brave Chrome/68.0.3440.91 Mobile Safari/537.36
            this.setVersion("");
            return true;
        }
        return false;
    }

    /**
     * Determine if the browser is Edge or not
     * @return boolean True if the browser is Edge otherwise false
     */
    protected java.lang.Boolean checkBrowserEdge() {
        java.lang.String name = containsIgnoreCase(this.userAgent, "Edge/") ?
                "Edge" :
                containsIgnoreCase(this.userAgent, "Edg/") || containsIgnoreCase(this.userAgent, "Edg/") ? "Edg" : "";
        if (name.length() > 1) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf(name.toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.setBrowser(BROWSER_EDGE);
                if (containsIgnoreCase(this.userAgent, "Windows Phone") || containsIgnoreCase(this.userAgent, "Android")) {
                    this.setMobile(true);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is Internet Explorer or not (last updated 1.7)
     * @return boolean True if the browser is Internet Explorer otherwise false
     */
    protected java.lang.Boolean checkBrowserInternetExplorer() {
        //  Test for IE11
        if (containsIgnoreCase(this.userAgent, "Trident/7.0; rv:11.0")) {
            this.setBrowser(BROWSER_IE);
            this.setVersion("11.0");
            return true;
        } // Test for v1 - v1.5 IE
        else if (containsIgnoreCase(this.userAgent, "microsoft internet explorer")) {
            this.setBrowser(BROWSER_IE);
            this.setVersion("1.0");
            java.lang.String result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("/"));
            if (result.matches("/308|425|426|474|0b1/i")) {
                this.setVersion("1.5");
            }
            return true;
        } // Test for versions > 1.5
        else if (containsIgnoreCase(this.userAgent, "msie") && !containsIgnoreCase(this.userAgent, "opera")) {
            // See if the browser is the odd MSN Explorer
            java.lang.String[] result;
            if (containsIgnoreCase(this.userAgent, "msnb")) {
                java.lang.String agentReplace = this.userAgent.replace(";", "; ");
                result = agentReplace.substring(agentReplace.indexOf("MSN")).split(" ");
                if (result.length >= 2) {
                    this.setBrowser(BROWSER_MSN);
                    this.setVersion(result[1].replace("(", "").replace(")", "").replace(";", ""));
                    return true;
                }
            }
            java.lang.String agentReplace = this.userAgent.replace(";", "; ");
            result = agentReplace.substring(agentReplace.indexOf("msie")).split(" ");
            if (result.length >= 2) {
                this.setBrowser(BROWSER_IE);
                this.setVersion(result[1].replace("(", "").replace(")", "").replace(";", ""));
                if (containsIgnoreCase(this.userAgent, "IEMobile")) {
                    this.setBrowser(BROWSER_POCKET_IE);
                    this.setMobile(true);
                }
                return true;
            }
        } // Test for versions > IE 10
        else if (containsIgnoreCase(this.userAgent, "trident")) {
            this.setBrowser(BROWSER_IE);
            java.lang.String[] result = this.userAgent.split("rv:");
            if (result.length >= 2) {
                this.setVersion(result[1].replaceAll("/[^0-9.]+/", ""));
                this.userAgent = this.userAgent.replace("Mozilla", "MSIE").replace("Gecko", "MSIE");
            }
        } // Test for Pocket IE
        else if (containsIgnoreCase(this.userAgent, "mspie") || containsIgnoreCase(this.userAgent, "pocket")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("mspie")).split(" ");
            if (result.length >= 2) {
                this.setPlatform(PLATFORM_WINDOWS_CE);
                this.setBrowser(BROWSER_POCKET_IE);
                this.setMobile(true);
                if (containsIgnoreCase(this.userAgent, "mspie")) {
                    this.setVersion(result[1]);
                } else {
                    java.lang.String[] aversion = userAgent.split("/");
                    if (aversion.length >= 2) {
                        this.setVersion(aversion[1]);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is Opera or not (last updated 1.7)
     * @return boolean True if the browser is Opera otherwise false
     */
    protected java.lang.Boolean checkBrowserOpera() {
        if (containsIgnoreCase(this.userAgent, "opera mini")) {
            java.lang.String resultant = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("opera mini"));
            if (resultant.matches("/\\//")) {
                java.lang.String[] result = resultant.split("/");
                if (result.length >= 2) {
                    java.lang.String[] aversion = result[1].split(" ");
                    this.setVersion(aversion[0]);
                }
            } else {
                java.lang.String[] aversion = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("opera mini")).split(" ");
                if (aversion.length >= 2) {
                    this.setVersion(aversion[1]);
                }
            }
            this.browserName = BROWSER_OPERA_MINI;
            this.setMobile(true);
            return true;
        } else if (containsIgnoreCase(this.userAgent, "opera")) {
            java.lang.String resultant = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("opera"));
            if (resultant.matches("/Version\\/")) {
                java.lang.String[] result = resultant.split("/Version");
                if (result.length >= 2) {
                    this.setVersion(result[1]);
                }
            } else if (resultant.matches("/\\//")) {
                java.lang.String[] result = resultant.replace("(", " ").split("/");
                if (result.length >= 2) {
                    java.lang.String[] aversion = result[1].split(" ");
                    this.setVersion(aversion[0]);
                }
            } else {
                java.lang.String[] aversion = resultant.substring(resultant.indexOf("opera")).split(" ");
                this.setVersion(aversion.length >= 2 ? aversion[1] : "");
            }
            if (containsIgnoreCase(this.userAgent, "Opera Mobi")) {
                this.setMobile(true);
            }
            this.browserName = BROWSER_OPERA;
            return true;
        } else if (containsIgnoreCase(this.userAgent, "OPR")) {
            java.lang.String resultant = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("OPR".toLowerCase()));
            if (resultant.matches("/\\//")) {
                java.lang.String[] result = resultant.replace("(", " ").split("/");
                if (result.length >= 2) {
                    java.lang.String[] aversion = result[1].split(" ");
                    this.setVersion(aversion[0]);
                }
            }
            if (containsIgnoreCase(this.userAgent, "Mobile")) {
                this.setMobile(true);
            }
            this.browserName = BROWSER_OPERA;
            return true;
        }
        return false;
    }

    /**
     * Determine if the browser is Chrome or not (last updated 1.7)
     * @return boolean True if the browser is Chrome otherwise false
     */
    protected java.lang.Boolean checkBrowserChrome() {
        if (containsIgnoreCase(this.userAgent, "Chrome")) {
            // TODO need preg_split on php init
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("Chrome".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.setBrowser(BROWSER_CHROME);
                //Chrome on Android
                if (containsIgnoreCase(this.userAgent, "Android")) {
                    if (containsIgnoreCase(this.userAgent, "Mobile")) {
                        this.setMobile(true);
                    } else {
                        this.setTablet(true);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is WebTv or not (last updated 1.7)
     * @return boolean True if the browser is WebTv otherwise false
     */
    protected java.lang.Boolean checkBrowserWebTv() {
        if (containsIgnoreCase(this.userAgent, "webtv")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("webtv".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0]);
                this.setBrowser(BROWSER_WEBTV);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is NetPositive or not (last updated 1.7)
     * @return boolean True if the browser is NetPositive otherwise false
     */
    protected java.lang.Boolean checkBrowserNetPositive() {
        if (containsIgnoreCase(this.userAgent, "NetPositive")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("NetPositive".toLowerCase())).split("/");
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion[0].replace("(", "").replace(")", "").replace(";", ""));
                this.setBrowser(BROWSER_NETPOSITIVE);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is Galeon or not (last updated 1.7)
     * @return boolean True if the browser is Galeon otherwise false
     */
    protected java.lang.Boolean checkBrowserGaleon() {
        if (containsIgnoreCase(this.userAgent, "galeon")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("galeon".toLowerCase())).split(" ");
            java.lang.String[] aversion = result[0].split("/");
            if (aversion.length >= 2) {
                this.setVersion(aversion[1]);
                this.setBrowser(BROWSER_GALEON);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is Konqueror or not (last updated 1.7)
     * @return boolean True if the browser is Konqueror otherwise false
     */
    protected java.lang.Boolean checkBrowserKonqueror() {
        if (containsIgnoreCase(this.userAgent, "Konqueror")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("Konqueror".toLowerCase())).split(" ");
            java.lang.String[] aversion = result[0].split("/");
            if (aversion.length >= 2) {
                this.setVersion(aversion[1]);
                this.setBrowser(BROWSER_KONQUEROR);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is iCab or not (last updated 1.7)
     * @return boolean True if the browser is iCab otherwise false
     */
    protected java.lang.Boolean checkBrowserIcab() {
        if (containsIgnoreCase(this.userAgent, "icab")) {
            java.lang.String[] aversion = this.userAgent.toLowerCase().substring(this.userAgent.replace("/", " ").toLowerCase().indexOf("icab".toLowerCase())).split(" ");
            if (aversion.length >= 2) {
                this.setVersion(aversion[1]);
                this.setBrowser(BROWSER_ICAB);
                return true;
            }
        }
        return false;
    }

    /**
     * Determine if the browser is OmniWeb or not (last updated 1.7)
     * @return boolean True if the browser is OmniWeb otherwise false
     */
    protected java.lang.Boolean checkBrowserOmniWeb() {
        if (containsIgnoreCase(this.userAgent, "omniweb")) {
            java.lang.String[] result = this.userAgent.toLowerCase().substring(this.userAgent.toLowerCase().indexOf("omniweb".toLowerCase())).split("/");
            this.setBrowser(BROWSER_OMNIWEB);
            if (result.length >= 2) {
                java.lang.String[] aversion = result[1].split(" ");
                this.setVersion(aversion.length >= 1 ? aversion[0] : "");
                return true;
            }
        }
        return false;
    }


    private boolean containsIgnoreCase(String str, String searchStr)     {
        if(str == null || searchStr == null) return false;

        final int length = searchStr.length();
        if (length == 0)
            return true;

        for (int i = str.length() - length; i >= 0; i--) {
            if (str.regionMatches(true, i, searchStr, 0, length))
                return true;
        }
        return false;
    }
}
