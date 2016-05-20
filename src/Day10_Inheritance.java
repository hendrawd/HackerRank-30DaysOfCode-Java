import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-inheritance">https://www.hackerrank.com/challenges/30-inheritance</a>
 * @since 5/20/16
 */

public class Day10_Inheritance {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day10_Inheritance();
    }

    private void solve() throws IOException {
        String firstName = nextToken();
        String lastName = nextToken();
        int id = nextInt();
        int numScores = nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = nextInt();
        }

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }

    public Day10_Inheritance() throws IOException {
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

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private int[] testScores;

        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        char calculate() {
            int count = 0;
            for (int i : testScores) {
                count += i;
            }
            int averageGrade = count / testScores.length;

            if (averageGrade >= 90 && averageGrade <= 100)
                return 'O';
            else if (averageGrade >= 80 && averageGrade <= 89)
                return 'E';
            else if (averageGrade >= 70 && averageGrade <= 79)
                return 'A';
            else if (averageGrade >= 55 && averageGrade <= 69)
                return 'P';
            else if (averageGrade >= 40 && averageGrade <= 54)
                return 'D';
            else if (averageGrade < 40)
                return 'T';
            else
                throw new IllegalStateException("Average score can't exceed 100");
        }
    }
}
