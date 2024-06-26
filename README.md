# vadymkykalo/browser.java

Helps detect the user's browser and platform at the JAVA level via the user agent

This repository based on https://github.com/cbschuld/Browser.php and was rewritten on JAVA

## Typical Usage:

```java 
String userAgent = "Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16";
Browser browser = new Browser(userAgent);
System.out.println("You have Browser: " + browser);
System.out.println("browser.getBrowser(): " + browser.getBrowser());
System.out.println("browser.getPlatform(): " + browser.getPlatform());
System.out.println("browser.getVersion(): " + browser.getVersion());
System.out.println("browser.getAolVersion(): " + browser.getAolVersion());
System.out.println("browser.getUserAgent(): " + browser.getUserAgent());
System.out.println("browser.isMobile(): " + browser.isMobile());
System.out.println("browser.isBrowser(browser.getBrowser()): " + browser.isBrowser(browser.getBrowser()));
System.out.println("browser.isMobile(): " + browser.isMobile());
System.out.println("browser.isRobot(): " + browser.isRobot());
System.out.println("browser.isAol(): " + browser.isAol());
System.out.println("browser.isFacebook(): " + browser.isFacebook());
System.out.println("browser.isChromeFrame(): " + browser.isChromeFrame());
System.out.println("browser.isTablet(): " + browser.isTablet());
```
and we get the following result

```text
You have Browser: Browser Name: Opera 
Browser Version: 12.16 
Browser User Agent String: Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16 
Platform: Linux
browser.getBrowser(): Opera
browser.getPlatform(): Linux
browser.getVersion(): 12.16
browser.getAolVersion(): unknown
browser.getUserAgent(): Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16
browser.isMobile(): false
browser.isBrowser(browser.getBrowser()): true
browser.isMobile(): false
browser.isRobot(): false
browser.isAol(): false
browser.isFacebook(): false
browser.isChromeFrame(): false
browser.isTablet(): false
```

## Maven dependency

```xml 
<dependency>
    <groupId>io.github.vadymkykalo</groupId>
    <artifactId>browser</artifactId>
    <version>0.1.2</version>
</dependency>
```

## Browser Detection

This solution identifies the following Browsers and does a best-guess on the version:

* Opera (`Browser.BROWSER_OPERA`)
* WebTV (`Browser.BROWSER_WEBTV`)
* NetPositive (`Browser.BROWSER_NETPOSITIVE`)
* Edge (`Browser.BROWSER_EDGE`)
* Internet Explorer (`Browser.BROWSER_IE`)
* Pocket Internet Explorer (`Browser.BROWSER_POCKET_IE`)
* Galeon (`Browser.BROWSER_GALEON`)
* Konqueror (`Browser.BROWSER_KONQUEROR`)
* iCab (`Browser.BROWSER_ICAB`)
* OmniWeb (`Browser.BROWSER_OMNIWEB`)
* Phoenix (`Browser.BROWSER_PHOENIX`)
* Firebird (`Browser.BROWSER_FIREBIRD`)
* UCBrowser (`Browser.BROWSER_UCBROWSER`)
* Firefox (`Browser.BROWSER_FIREFOX`)
* Mozilla (`Browser.BROWSER_MOZILLA`)
* Palemoon (`Browser.BROWSER_PALEMOON`)
* curl (`Browser.BROWSER_CURL`)
* wget (`Browser.BROWSER_WGET`)
* Amaya (`Browser.BROWSER_AMAYA`)
* Lynx (`Browser.BROWSER_LYNX`)
* Safari (`Browser.BROWSER_SAFARI`)
* Playstation (`Browser.BROWSER_PLAYSTATION`)
* iPhone (`Browser.BROWSER_IPHONE`)
* iPod (`Browser.BROWSER_IPOD`)
* Google.s Android(`Browser.BROWSER_ANDROID`)
* Google.s Chrome(`Browser.BROWSER_CHROME`)
* GoogleBot(`Browser.BROWSER_GOOGLEBOT`)
* Yahoo!.s Slurp(`Browser.BROWSER_SLURP`)
* W3C.s Validator(`Browser.BROWSER_W3CVALIDATOR`)
* BlackBerry(`Browser.BROWSER_BLACKBERRY`)

## Operating System Detection

This solution identifies the following Operating Systems:

* Windows (`Browser.PLATFORM_WINDOWS`)
* Windows CE (`Browser.PLATFORM_WINDOWS_CE`)
* Apple (`Browser.PLATFORM_APPLE`)
* Linux (`Browser.PLATFORM_LINUX`)
* Android (`Browser.PLATFORM_ANDROID`)
* OS/2 (`Browser.PLATFORM_OS2`)
* BeOS (`Browser.PLATFORM_BEOS`)
* iPhone (`Browser.PLATFORM_IPHONE`)
* iPod (`Browser.PLATFORM_IPOD`)
* BlackBerry (`Browser.PLATFORM_BLACKBERRY`)
* FreeBSD (`Browser.PLATFORM_FREEBSD`)
* OpenBSD (`Browser.PLATFORM_OPENBSD`)
* NetBSD (`Browser.PLATFORM_NETBSD`)
* SunOS (`Browser.PLATFORM_SUNOS`)
* OpenSolaris (`Browser.PLATFORM_OPENSOLARIS`)
* iPad (`Browser.PLATFORM_IPAD`)

## History and Legacy

Detecting the user's browser type and version is helpful in web applications that harness some of the newer bleeding edge concepts. With the browser type and version you can notify users about challenges they may experience and suggest they upgrade before using such application. Not a great idea on a large scale public site; but on a private application this type of check can be helpful.

In an active project of mine we have a pretty graphically intensive and visually appealing user interface which leverages a lot of transparent PNG files. Because we all know how great IE6 supports PNG files it was necessary for us to tell our users the lack of power their browser has in a kind way.

Searching for a way to do this at the Java layer and not at the client layer was more of a challenge than I would have guessed; the only script available was written by Gary White and Gary no longer maintains this script because of reliability. I do agree 100% with Gary about the readability; however, there are realistic reasons to desire the user.s browser and browser version and if your visitor is not echoing a false user agent we can take an educated guess.

I based this solution off of Gary White's original work but have since replaced all of his original code.  Either way, thank you to Gary.  Sadly, I never was able to get in touch with him regarding this solution.

## Testing

Run tests
```bash
mvn -Dtest="io.github.vadymkykalo.browser/*Test" test
```

Each file is tab delimited with the following fields:

User Agent, User Agent Type, Browser, Version, Operating System, Operating System Version eg
```
Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16	Browser	Opera	12.16	Linux	Linux	
Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.186 Safari/535.1   Browser	Chrome 14.0.835.186 Macintosh OS X	10_7_2
```

## Contributions

Please feel free to open an [issue](https://github.com/vadymkykalo/Browser.java/issues) and support the product if you saw the benefit in it
