import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-exceptions-string-to-integer">https://www.hackerrank.com/challenges/30-exceptions-string-to-integer</a>
 * @since 5/20/16
 */

public class Day16_ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            System.out.print(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            System.out.print("Bad String");
        }
        scanner.close();
    }
}
