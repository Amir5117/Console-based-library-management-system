import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService library = new LibraryService();

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // Ensure input is an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    library.listBooks();
                    System.out.print("Enter book number to borrow: ");
                    if (scanner.hasNextInt()) {
                        int borrowIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Clear buffer
                        library.borrowBook(borrowIndex);
                    } else {
                        System.out.println("Invalid input.");
                        scanner.next(); // Clear buffer
                    }
                    break;
                case 4:
                    library.listBooks();
                    System.out.print("Enter book number to return: ");
                    if (scanner.hasNextInt()) {
                        int returnIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Clear buffer
                        library.returnBook(returnIndex);
                    } else {
                        System.out.println("Invalid input.");
                        scanner.next(); // Clear buffer
                    }
                    break;
                case 5:
                    System.out.println("Exiting library system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
