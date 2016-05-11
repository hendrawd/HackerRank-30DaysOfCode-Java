import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-dictionaries-and-maps">https://www.hackerrank.com/challenges/30-dictionaries-and-maps</a>
 * @since 5/11/16
 */

public class Day8_DictionariesAndMaps {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day8_DictionariesAndMaps();
    }

    private void solve() throws IOException {
        Map<String, Integer> map = new HashMap<>();
        int n = nextInt();
        for (int i = 0; i < n; i++) {
            String name = nextToken();
            int phone = nextInt();
            map.put(name, phone);
        }
        String nextToken = nextToken();
        while (nextToken != null) {
            out.println(map.get(nextToken) == null ?
                    "Not found" : nextToken + "=" + map.get(nextToken));
            nextToken = nextToken();
        }
    }

    public Day8_DictionariesAndMaps() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return st.nextToken();
    }

    private int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    private long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    private double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
