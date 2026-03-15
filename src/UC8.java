import java.util.LinkedList;

public class UC8 {

    public static void main(String[] args) {

        // Define input string
        String input = "level";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

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