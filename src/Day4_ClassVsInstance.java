import java.util.Scanner;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-class-vs-instance">https://www.hackerrank.com/challenges/30-class-vs-instance</a>
 * @since 5/9/16
 * this real class name should be Person, but i changed it for consistency class naming of this challenge
 */
public class Day4_ClassVsInstance {

    private int age;

    public Day4_ClassVsInstance(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String statement;
        if (age < 13)
            statement = "You are young.";
        else if (age >= 13 && age < 18)
            statement = "You are a teenager.";
        else
            statement = "You are old.";
        System.out.println(statement);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_ClassVsInstance p = new Day4_ClassVsInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
