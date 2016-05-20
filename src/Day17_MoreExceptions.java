import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-more-exceptions">https://www.hackerrank.com/challenges/30-more-exceptions</a>
 * @since 5/20/16
 */

public class Day17_MoreExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

    static class Calculator {
        int power(int n, int p) {
            if (n < 0 || p < 0)
                throw new IllegalStateException("n and p should be non-negative");
            else
                return (int) Math.pow(n, p);
        }
    }
}
