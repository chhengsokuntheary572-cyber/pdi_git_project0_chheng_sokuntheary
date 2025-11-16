import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;

public class BankingSimulator {

    // Helper method to find an account by ID
    private static Optional<Account> findAccount(List<Account> accounts, int id) {
        return accounts.stream()
                .filter(a -> a.getAccountNumber() == id)
                .findFirst();
    }

    public static void main(String[] args) {
        // Initialize mock customer data (N=3)
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1001, "Alice Johnson", 500.00));
        accounts.add(new Account(1002, "Bob Smith", 1250.75));
        accounts.add(new Account(1003, "Charlie Brown", 50.00));

        System.out.println("--- Basic Banking System Simulation ---");
        System.out.println("Available Accounts: 1001, 1002, 1003\n");

        try (Scanner input = new Scanner(System.in)) {
            int choice = 0;

            // Main Menu Loop
            while (choice != 3) {
                System.out.println("\nSelect an operation:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Exit");
                System.out.print("Enter choice (1-3): ");

                if (input.hasNextInt()) {
                    choice = input.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.nextLine(); // consume invalid input
                    continue;
                }

                if (choice == 1 || choice == 2) {
                    System.out.print("Enter Account Number: ");
                    int accNum = input.nextInt();

                    // Search for the account
                    Optional<Account> targetAccount = findAccount(accounts, accNum);

                    if (targetAccount.isPresent()) {
                        Account account = targetAccount.get();

                        System.out.print("Enter Amount: $");
                        double amount = input.nextDouble();

                        if (choice == 1) {
                            account.deposit(amount);
                        } else { // choice == 2
                            account.withdraw(amount);
                        }

                        // Output: Display updated details
                        account.displayDetails();

                    } else {
                        System.out.println("Error: Account Number " + accNum + " not found.");
                    }
                } else if (choice != 3) {
                    System.out.println("Invalid menu choice. Please try again.");
                }
            }
        }

        System.out.println("Thank you for using the Banking System. Goodbye!");
    }
}