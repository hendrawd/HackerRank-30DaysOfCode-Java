import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-data-types">https://www.hackerrank.com/challenges/30-data-types</a>
 * @since 5/4/16
 */
public class Day1DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);
        scan.close();
    }
}
