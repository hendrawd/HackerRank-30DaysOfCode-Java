import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-hello-world">https://www.hackerrank.com/challenges/30-hello-world</a>
 * @since 5/4/16
 */
public class Day0HelloWorld {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
        String inputString = scan.nextLine(); // read a line of input and save it to a variable
        scan.close(); // close the scanner

        //one liner
        System.out.println("Hello, World.\n" + inputString);
    }
}
