import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-nested-logic">https://www.hackerrank.com/challenges/30-nested-logic</a>
 * @since 5/29/16
 */
public class Day26_NestedLogic {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day26_NestedLogic();
    }

    void solve() throws IOException {
        int d1 = nextInt();
        int m1 = nextInt();
        int y1 = nextInt();
        int d2 = nextInt();
        int m2 = nextInt();
        int y2 = nextInt();
        if (y1 - y2 > 0) {
            out.print(10_000);
        } else {
            int monthDiff = m1 - m2;
            if (monthDiff > 0) {
                out.print(monthDiff * 500);
            } else {
                int dayDiff = d1 - d2;
                out.print(dayDiff < 0 ? 0 : dayDiff * 15);
            }
        }
    }

    Day26_NestedLogic() throws IOException {
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
