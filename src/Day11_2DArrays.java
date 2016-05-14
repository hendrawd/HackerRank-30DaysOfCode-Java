import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-2d-arrays">https://www.hackerrank.com/challenges/30-2d-arrays</a>
 * @since 5/14/16
 */
public class Day11_2DArrays {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day11_2DArrays();
    }

    void solve() throws IOException {
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = nextInt();
            }
        }
        out.print(getMaxHourglassSum(arr));
    }

    private int getMaxHourglassSum(int[][] arr) {
        int maxHourglassSum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                int currentSum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                if (currentSum > maxHourglassSum) {
                    maxHourglassSum = currentSum;
//                    out.println(arr[i - 1][j - 1] + " + " + arr[i][j - 1] + " + " + arr[i + 1][j - 1] + " + " + arr[i][j] + " + " + arr[i - 1][j + 1] + " + " + arr[i][j + 1] + " + " + arr[i + 1][j + 1]);
                }
            }
        }
        return maxHourglassSum;
    }

    Day11_2DArrays() throws IOException {
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
