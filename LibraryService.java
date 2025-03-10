import java.util.ArrayList;
import java.util.List;

class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Available Books:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    public void borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).borrowBook();
        } else {
            System.out.println("Invalid book selection.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).returnBook();
        } else {
            System.out.println("Invalid book selection.");
        }
    }
}
