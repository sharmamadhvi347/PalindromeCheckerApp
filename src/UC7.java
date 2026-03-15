import java.util.Deque;
import java.util.ArrayDeque;

public class UC7 {

    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters into deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare first and last elements
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}