import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-abstract-classes">https://www.hackerrank.com/challenges/30-abstract-classes</a>
 * @since 5/20/16
 */

public class Day13_AbstractClasses {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day13_AbstractClasses();
    }

    private void solve() throws IOException {
        String title = nextToken();
        String author = nextToken();
        int price = nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }

    public Day13_AbstractClasses() throws IOException {
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

    abstract class Book {
        String title;
        String author;

        Book(String t, String a) {
            title = t;
            author = a;
        }

        abstract void display();
    }

    class MyBook extends Book {

        private int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        @Override
        void display() {
            out.print("Title: " + title + "\n" +
                    "Author: " + author + "\n" +
                    "Price: " + price);
        }
    }
}
