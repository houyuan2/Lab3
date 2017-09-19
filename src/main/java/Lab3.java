import java.io.IOException;
    import java.net.URL;
    import java.util.Scanner;

public class Lab3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String doc = urlToString("http://erdani.com/tdpl/hamlet.txt");
        int count = 0;
        int n = 0;
        String space = " ";
        String word = "";
        int length = doc.length();
        while (n < length) {
            word = "" + doc.charAt(n);
            n++;
            if (word.equals(space)) {
            count++;
            }
        }
        count++;
        System.out.println(count);
    }
}