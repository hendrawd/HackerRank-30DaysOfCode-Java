import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-sorting">https://www.hackerrank.com/challenges/30-sorting</a>
 * @since 5/26/16
 */

public class Day20_Sorting {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;
    private boolean isSorted = false;

    public static void main(String[] args) throws IOException {
        new Day20_Sorting();
    }

    private void solve() throws IOException {
        int n = nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nextInt();
        }

        int step = -1;
        while (!isSorted) {
            step++;
            array = sortOneElement(array);
        }
        out.println("Array is sorted in " + step + " swaps.");
        out.println("First Element: " + array[0]);
        out.println("Last Element: " + array[n - 1]);
    }

    private int[] sortOneElement(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                break;
            }
            if (i == array.length - 2) {
                isSorted = true;
            }
        }
        return array;
    }

    public Day20_Sorting() throws IOException {
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
