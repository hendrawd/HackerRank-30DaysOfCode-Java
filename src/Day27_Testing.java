import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-testing">https://www.hackerrank.com/challenges/30-testing</a>
 * @since 5/30/16
 */
public class Day27_Testing {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day27_Testing();
    }

    void solve() throws IOException {
        out.println("5");
        out.println("5 3");
        out.println("1 2 3 0 -1");
        out.println("6 3");
        out.println("-1 -2 -3 0 1 1");
        out.println("7 3");
        out.println("1 2 3 0 -1 2 2");
        out.println("8 3");
        out.println("1 2 3 0 -1 2 -2 -1");
        out.println("9 4");
        out.println("1 2 3 0 -1 2 -2 -1 7");
    }

    Day27_Testing() throws IOException {
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
