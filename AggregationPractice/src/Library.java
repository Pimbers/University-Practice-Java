import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> books;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("Added to " + name + ": " + book);
        } else {
            System.out.println("Book already exists in " + name + ": " + book);
        }
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Removed from " + name + ": " + book);
        } else {
            System.out.println("Book not found in " + name + ": " + book);
        }
    }

    public void displayAllBooks() {
        System.out.println("Books in " + name + ", " + location + ":");
        for (Book book : books) {
            System.out.println(" - " + book);
        }
    }

    public Book findBooksByISBN(String isbn) {
        System.out.println("Searching for books with ISBN " + isbn + " in " + name + ":");
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Found: " + book);
                return book;
            }
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        System.out.println("Searching for books by " + author + " in " + name + ":");
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found: " + book);
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public int getBookCount() {
        return books.size();
    }
}
