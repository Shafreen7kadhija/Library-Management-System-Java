import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View all books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n-------------------------------");
        System.out.printf("%-10s %-25s %-20s %-12s%n",
                "ID", "Title", "Author", "Status");
        System.out.println("----------------------------------------------------------------");

        for (Book book : books) {

            String status;

            if (book.isAvailable()) {
                status = "Available";
            } else {
                status = "Borrowed";
            }

            System.out.printf("%-10d %-25s %-20s %-12s%n",
                    book.getBookId(),
                    book.getTitle(),
                    book.getAuthor(),
                    status);
        }
    }
}