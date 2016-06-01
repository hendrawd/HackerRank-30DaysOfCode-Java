import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-bitwise-and">https://www.hackerrank.com/challenges/30-bitwise-and</a>
 * @since 6/1/16
 */
public class Day29_BitwiseAND {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day29_BitwiseAND();
    }

    void solve() throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            int n = nextInt();
            int k = nextInt();
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int x = i & j;
                    if (x < k && maxValue < x) {
                        maxValue = x;
                    }
                }
            }
            out.println(maxValue);
        }
    }

    Day29_BitwiseAND() throws IOException {
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

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
