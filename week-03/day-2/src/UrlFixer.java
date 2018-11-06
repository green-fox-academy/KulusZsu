public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        /* resolve 1
        url = url.replace("bots", "odds");
        url = url.replace("https", "https:" );
        */

        /* resolve 2 */
        url = url.replace("bots", "odds");
        String extra = new StringBuffer(url).insert(5, ":").toString();
        url = extra;


        System.out.println(url);

    }
}
