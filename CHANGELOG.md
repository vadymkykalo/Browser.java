# Changelog

## [0.2.0] - 2026-05-23

### Fixed
- `checkBrowserSafari`: avoid `StringIndexOutOfBoundsException` when User-Agent
  contains `Safari` but no `Version` token (e.g.
  `Mozilla/5.0 (Mac OS X 13_2) AppleWebKit/537.36 (KHTML, like Gecko) Safari/103.0 Safari/537.36`).
  Reported via Sentry from production traffic.

### Added
- Edge: support for `EdgiOS/` pattern (Microsoft Edge on iOS).
- New browsers: Arc (`BROWSER_ARC`), DuckDuckGo (`BROWSER_DUCKDUCKGO`),
  Naver Whale (`BROWSER_WHALE`), Tor Browser (`BROWSER_TOR`).
- New AI / LLM crawlers (flagged as `isRobot()`):
  GPTBot (`BROWSER_GPTBOT`), ChatGPT-User (`BROWSER_CHATGPT_USER`),
  ClaudeBot (`BROWSER_CLAUDEBOT`), PerplexityBot (`BROWSER_PERPLEXITYBOT`),
  Applebot (`BROWSER_APPLEBOT`), CCBot (`BROWSER_CCBOT`).
- New platform: HarmonyOS / OpenHarmony (`PLATFORM_HARMONYOS`).
- New tests for Safari, Arc, DuckDuckGo, Whale, AI bots and Edge iOS.

### Changed
- `checkBrowserEdge` refactored to a clean loop-based pattern matcher
  (in sync with upstream `cbschuld/Browser.php` 2.0.0).
- Build target bumped from Java 7 to Java 8 (Java 7 is no longer supported by
  modern JDKs).

## [0.1.2]
- Earlier release based on `cbschuld/Browser.php` ~1.9.4.
