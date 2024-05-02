public class PrimeChecker {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PrimeChecker <number>");
        } else {
            try {
                int num = Integer.parseInt(args[0]);
                if (isPrime(num)) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}