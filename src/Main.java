import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     * @return
     */
    public static void main(String[] args) {

        String url1 = "http://erdani.com/tdpl/hamlet.txt";
        String url2 = "https://www.bls.gov/tus/charts/chart9.txt";
        String url3 = "http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt";
        int sum = 0;
        String str = urlToString(url1);

        }

    public static int wordCounter(String str) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        str = urlToString(url1);
        if(!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length()- 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    sum++;
                }
            }
            sum = sum + 1;

        }
        return sum;
    }


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    private static String urlToString(final String url) {
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
}
