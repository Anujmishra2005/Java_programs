public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PalindromeChecker <number>");
        } else {
            try {
                int num = Integer.parseInt(args[0]);
                if (isPalindrome(num)) {
                    System.out.println(num + " is a palindrome number.");
                } else {
                    System.out.println(num + " is not a palindrome number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
