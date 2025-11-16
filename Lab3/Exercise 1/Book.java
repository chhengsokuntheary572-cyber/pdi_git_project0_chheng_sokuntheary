import java.util.Date;

public class Book {

    // Variables
    private int ID;
    private final String title;
    private final String author;
    private final float price;
    private final Date registered_date;

    // Constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.registered_date = new Date();
    }

    // Apply ID
    public void applyID(int ID) {
        this.ID = ID;
    }

    // Display all details
    public void displayAllDetails() {
        System.out.printf(
            "%2d | %-25s | %-20s | $%-8.2f | %s\n",
            ID, title, author, price, registered_date.toString()
        );
    }

    // Optional: search by ID
    public boolean isID(int ID) {
        return this.ID == ID;
    }
}
