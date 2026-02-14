import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" Welcome to the Palindrome Checker System ");
        System.out.println("============================================");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------");

        // UC2: Palindrome Checking Logic

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check palindrome
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}
