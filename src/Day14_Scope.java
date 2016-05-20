import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-scope">https://www.hackerrank.com/challenges/30-scope</a>
 * @since 5/20/16
 */

public class Day14_Scope {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day14_Scope();
    }

    private void solve() throws IOException {
        int N = nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        out.print(D.maximumDifference);
    }

    public Day14_Scope() throws IOException {
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

    class Difference {
        private int[] elements;
        public int maximumDifference;

        Difference(int[] elements) {
            this.elements = elements;
        }

        void computeDifference() {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i : elements) {
                max = i > max ? i : max;
                min = i < min ? i : min;
            }
            maximumDifference = max - min;
        }
    }
}
