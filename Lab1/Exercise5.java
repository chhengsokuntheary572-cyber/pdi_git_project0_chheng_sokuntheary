import java.util.Scanner;

class PrimeNumberChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("Input n: ");
                int n = input.nextInt();

                if (n < 2) {
                    System.out.println("Output: No prime numbers less than 2.\n");
                    continue;
                }

                System.out.print("Output: All prime numbers from 2 to " + n + ": ");
                for (int i = 2; i <= n; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println("\n");
            }
        }
    }
}
