public class Account {
    private final int accountNumber;
    private final String name;
    private double balance;

    // Constructor to initialize an account
    public Account(int accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    // Accessor for Account Number (needed for searching)
    public int getAccountNumber() {
        return accountNumber;
    }

    // Process: Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. New balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Process: Withdraw money (includes balance check)
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f\n", amount, balance);
            return true;
        } else {
            System.out.println("Transaction failed: Insufficient balance. Current balance: $" + balance);
            return false;
        }
    }

    // Output: Display updated account details
    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + name);
        System.out.printf("Current Balance: $%.2f\n", balance);
        System.out.println("------------------------");
    }
}