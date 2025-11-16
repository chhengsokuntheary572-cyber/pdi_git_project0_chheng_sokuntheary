import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryManager {

    public static void main(String[] args) {
        // Use ArrayList to store inventory items
        List<InventoryItem> inventory = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("--- Store Inventory Management System ---");

            // 1. Get number of items (N)
            System.out.print("Enter the number of unique items (N): ");
            int n = input.nextInt();
            input.nextLine(); // Consume newline

            // 2. Loop to get details for each item
            for (int i = 1; i <= n; i++) {
                System.out.println("\n-- Entering details for Item #" + i + " --");

                System.out.print("Enter Item ID: ");
                int itemId = input.nextInt();
                input.nextLine(); // Consume newline

                System.out.print("Enter Item Name: ");
                String name = input.nextLine();

                System.out.print("Enter Quantity in Stock: ");
                int quantity = input.nextInt();

                System.out.print("Enter Price per Item: $");
                double price = input.nextDouble();
                input.nextLine(); // Consume newline

                // Create InventoryItem object, which calculates Total Cost automatically
                InventoryItem item = new InventoryItem(itemId, name, quantity, price);
                inventory.add(item);
            }
        }

        // 3. Display Results
        System.out.println("\n==========================================================================================");
        System.out.println("                                  STORE INVENTORY REPORT");
        System.out.println("==========================================================================================");

        // Print Header
        System.out.printf("| %-7s | %-25s | %-10s | %-12s | %-12s |\n",
            "Item ID", "Name", "Quantity", "Unit Price", "Total Cost");
        System.out.println("------------------------------------------------------------------------------------------");

        // Print Item Details
        for (InventoryItem item : inventory) {
            item.displayDetails();
        }
        System.out.println("==========================================================================================");
    }
}