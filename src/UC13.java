public class UC13 {

    public static void main(String[] args) {

        String input = "level";

        // Start time
        long startTime = System.nanoTime();

        // Palindrome logic
        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start <= end) {

            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}