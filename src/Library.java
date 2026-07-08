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

    // Search a book by ID
public void searchBook(int bookId) {

    for (Book book : books) {

        if (book.getBookId() == bookId) {

            System.out.println("\nBook Found!");
            System.out.println("----------------------------");
            System.out.println("Book ID : " + book.getBookId());
            System.out.println("Title   : " + book.getTitle());
            System.out.println("Author  : " + book.getAuthor());

            if (book.isAvailable()) {
                System.out.println("Status  : Available");
            } else {
                System.out.println("Status  : Borrowed");
            }

            return;
        }
    }

    System.out.println("Book not found.");
}

// Borrow a book
public void borrowBook(int bookId) {

    for (Book book : books) {

        if (book.getBookId() == bookId) {

            if (book.isAvailable()) {

                book.setAvailable(false);
                System.out.println("Book borrowed successfully!");

            } else {

                System.out.println("Book is already borrowed.");
            }

            return;
        }
    }
        System.out.println("Book not found.");
    }
    // Return a book
public void returnBook(int bookId) {

    for (Book book : books) {

        if (book.getBookId() == bookId) {

            if (!book.isAvailable()) {

                book.setAvailable(true);
                System.out.println("Book returned successfully!");

            } else {

                System.out.println("Book is already available.");
            }

            return;
        }
    }

    System.out.println("Book not found.");
}
}