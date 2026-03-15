import java.util.Stack;

public class UC5 {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}