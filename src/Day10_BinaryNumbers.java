import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-binary-numbers">https://www.hackerrank.com/challenges/30-binary-numbers</a>
 * @since 5/14/16
 */
public class Day10_BinaryNumbers {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day10_BinaryNumbers();
    }

    void solve() throws IOException {
        int n = nextInt();
        String binaryString = Integer.toBinaryString(n);
        int maxCounter = 0;
        int counter = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                counter++;
                if (counter > maxCounter)
                    maxCounter = counter;
            } else if (binaryString.charAt(i) == '0') {
                counter = 0;
            }
        }
        out.print(maxCounter);
    }

    Day10_BinaryNumbers() throws IOException {
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
