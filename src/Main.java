import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n====================================");
            System.out.println("   LIBRARY MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Book selected.");
                    break;

                case 2:
                    System.out.println("View Books selected.");
                    break;

                case 3:
                    System.out.println("Search Book selected.");
                    break;

                case 4:
                    System.out.println("Borrow Book selected.");
                    break;

                case 5:
                    System.out.println("Return Book selected.");
                    break;

                case 6:
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}