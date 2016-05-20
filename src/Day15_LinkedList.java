import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-linked-list">https://www.hackerrank.com/challenges/30-linked-list</a>
 * @since 5/20/16
 */

public class Day15_LinkedList {
    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new Day15_LinkedList();
    }

    private void solve() throws IOException {
        Node head = null;
        int N = nextInt();
        while (N-- > 0) {
            int ele = nextInt();
            head = insert(head, ele);
        }
        display(head);
    }

    private Node insert(Node head, int data) {
        if (head == null)
            return new Node(data);
        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = new Node(data);
        return head;
    }

    private void display(Node head) {
        Node start = head;
        while (start != null) {
            out.print(start.data + " ");
            start = start.next;
        }
    }

    public Day15_LinkedList() throws IOException {
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

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
