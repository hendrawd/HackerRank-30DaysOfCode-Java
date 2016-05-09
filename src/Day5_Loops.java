import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-loops">https://www.hackerrank.com/challenges/30-loops</a>
 * @since 5/9/16
 */
public class Day5_Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
        scanner.close();
    }
}
