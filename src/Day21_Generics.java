/**
 * @author hendrawd
 * @see <a href="https://www.hackerrank.com/challenges/30-generics">https://www.hackerrank.com/challenges/30-generics</a>
 * @since 5/26/16
 */

public class Day21_Generics {

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if (Day21_Generics.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }
    }

    private static void printArray(Object[] objectArray) {
        for (Object object : objectArray) {
            System.out.println(object);
        }
    }
}
