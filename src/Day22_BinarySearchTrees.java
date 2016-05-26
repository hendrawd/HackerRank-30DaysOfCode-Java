import java.util.Scanner;
import java.util.Stack;

/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-binary-search-trees">https://www.hackerrank.com/challenges/30-binary-search-trees</a>
 * @since 5/26/16
 */

public class Day22_BinarySearchTrees {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    private static Stack<Node> stackNode = new Stack<>();
    private static Stack<Integer> stackDirection = new Stack<>();
    private static final int DIRECTION_LEFT = 0;
    private static final int DIRECTION_RIGHT = 1;
    private static int currentHeight = 0;
    private static int maxHeight = 0;

    public static int getHeight(Node root) {
        while (root != null) {
            root = bst(root);
            maxHeight = currentHeight > maxHeight ? currentHeight : maxHeight;
        }
        return maxHeight;
    }

    private static Node bst(Node current) {
        if (current.left != null) {
            //go to left
            currentHeight++;
            stackNode.push(current);
            stackDirection.push(DIRECTION_LEFT);
            current = current.left;
        } else if (current.right != null) {
            //go to right
            currentHeight++;
            stackNode.push(current);
            stackDirection.push(DIRECTION_RIGHT);
            current = current.right;
        } else {
            //end, go back
            currentHeight--;
            if (!stackNode.isEmpty()) {
                current = stackNode.pop();
                int direction = stackDirection.pop();
                if (direction == DIRECTION_LEFT)
                    current.left = null;
                else if (direction == DIRECTION_RIGHT)
                    current.right = null;
            } else {
                return null;
            }
        }
        return current;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
