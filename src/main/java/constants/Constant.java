package constants;

import java.time.Duration;

public class Constant {
    public static class TimeOutVariables{
        public static final Duration IMPLICIT_WAIT = Duration.ofSeconds(3);
        public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(3);

    }

    public static class Configuration {
        /*
         * Clear browser cookies on each iteration
         * if TRUE - clear cookies
         * */
        public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;
        /*
         * To keep the browser open after test
         * if true - browser close
         * */
        public static final Boolean HOLD_BROWSER_OPEN = true;
    }

    public static class Urls{
        public static final String MAIN_PAGE = "https://www.imdb.com/";

    }

    public static class Variables {
        public static final String negativeSearch = "?/?61423186574635";
        public static final String positiveCase = "lord";
        public static final String positiveCaseMovie ="The Lord of the Rings: The Fellowship of the Ring";
        public static final String emptyRequestString = "Search IMDb by typing a word or phrase in the search box at the top of this page.";
        public static final String resultNotFoundString = "No results found for \""+ negativeSearch +"\"";

    }
}
