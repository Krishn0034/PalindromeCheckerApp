public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC3: Reverse String Palindrome Check ");
        System.out.println("====================================");

        // Hardcoded string
        String input = "madam";

        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}