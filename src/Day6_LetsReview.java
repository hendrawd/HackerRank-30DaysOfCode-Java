import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-review-loop">https://www.hackerrank.com/challenges/30-review-loop</a>
 * @since 5/9/16
 */
public class Day6_LetsReview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        while (input-- > 0) {
            System.out.println(divideCharsByEvenOddIndex(scanner.nextLine()));
        }
    }

    private static String divideCharsByEvenOddIndex(String inputString) {
        String first = "";
        String second = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 2 == 0)
                first += inputString.charAt(i);
            else
                second += inputString.charAt(i);
        }
        return first + " " + second;
    }
}
