import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-conditional-statements">https://www.hackerrank.com/challenges/30-conditional-statements</a>
 * @since 5/9/16
 */
public class Day3_IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n > 1 && n < 6) {
                ans = "Not Weird";
            } else if (n > 6 && n < 21) {
                ans = "Weird";
            } else if (n > 20) {
                ans = "Not Weird";
            } else {

            }
        }
        System.out.println(ans);
    }
}
