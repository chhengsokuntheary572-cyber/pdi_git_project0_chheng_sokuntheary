public class InventoryItem {
    private final int itemId;
    private final String name;
    private final int quantity;
    private final double price;
    private final double totalCost;

    // Constructor: Takes ID, Name, Quantity, and Price
    public InventoryItem(int itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        
        // Process: Calculate Total Cost during object creation
        this.totalCost = calculateTotalCost();
    }
    
    // Method to calculate Total Cost
    private double calculateTotalCost() {
        // Total Cost = Price * Quantity
        return this.price * this.quantity;
    }

    // Method to display all details and the calculated total cost
    public void displayDetails() {
        System.out.printf("| %-7d | %-25s | %-10d | $%-12.2f | $%-12.2f |\n", 
            itemId, name, quantity, price, totalCost);
    }
}