import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-queues-stacks">https://www.hackerrank.com/challenges/30-queues-stacks</a>
 * @since 5/26/16
 */

public class Day18_QueuesAndStacks {

    private Queue<Character> queue = new LinkedList<>();
    private Stack<Character> stack = new Stack<>();

    private void pushCharacter(char ch) {
        stack.push(ch);
    }

    private void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    private char popCharacter() {
        return stack.pop();
    }

    private char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_QueuesAndStacks p = new Day18_QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
