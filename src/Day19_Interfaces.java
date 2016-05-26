import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-interfaces">https://www.hackerrank.com/challenges/30-interfaces</a>
 * @since 5/26/16
 */

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        if (n == 1)
            return 1;
        int maxDivisor = (int) Math.sqrt(n);
        int sum = n + 1;
        for (int i = 2; i <= maxDivisor; i++) {
            if (n % i == 0) {
                sum += i;
                int divisor = n / i;
                if (divisor != i)
                    sum += divisor;
            }
        }
        return sum;
    }
}

public class Day19_Interfaces {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
