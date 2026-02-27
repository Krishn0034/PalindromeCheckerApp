public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "A man a plan a canal Panama";

        // Normalize string:
        // 1. Remove non-alphanumeric characters
        // 2. Convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        boolean isPalindrome = true;

        int length = normalized.length();

        // Compare characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}