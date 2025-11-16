
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        final List<Book> books = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("<< Welcome to the Library Program! >>\n");

            // 1. Get number of books
            System.out.print("How many books?: ");
            int number_of_book = input.nextInt();
            input.nextLine(); // consume newline

            // 2. Loop to get each book's details
            for (int k = 1; k <= number_of_book; k++) {

                System.out.println("\n\t*Getting data for book #" + k);

                System.out.print("Enter Book Title: ");
                String title = input.nextLine();

                System.out.print("Enter Book Author: ");
                String author = input.nextLine();

                System.out.print("Enter the book price: ");
                float price = input.nextFloat();
                input.nextLine(); // consume newline

                // Create the book object
                Book b = new Book(title, author, price);
                b.applyID(k); // ID starts from 1

                books.add(b);
            }
        }

        // 3. Show all book details
        System.out.println("\n----- ALL BOOKS -----");
        System.out.printf("%2s | %-25s | %-20s | %-9s | %s\n",
                "ID", "Title", "Author", "Price", "Registered Date");
        System.out.println("-----------------------------------------------------------------------");

        for (Book book : books) {
            book.displayAllDetails();
        }
    }
}
