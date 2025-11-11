public class AggregationTest {
    public static void main(String[] args) {

        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("978-0596009205", "Clean Code", "Robert C. Martin", 2008);
        Book book3 = new Book("978-0132350884", "Design Patterns", "Gang of Four", 1994);

        System.out.println("=== Books created independently ===");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Library mainLibrary= new Library("Central Library", "Downtown");
        Library branchLibrary = new Library("Branch Library", "Suburb");

        System.out.println("\n=== Adding books to libraries ===");
        mainLibrary.addBook(book1);
        mainLibrary.addBook(book2);
        mainLibrary.addBook(book3);

        branchLibrary.addBook(book1);
        branchLibrary.addBook(book2);
        
        mainLibrary.displayAllBooks();
        branchLibrary.displayAllBooks();

        System.out.println("\n=== Removing book from Main Library ===");
        mainLibrary.removeBook(book1);

        System.out.println("Book still exists: " + book1);
        branchLibrary.displayAllBooks();

        System.out.println("\n === Books exist independently ===");
        System.out.println("Book 1 details: " + book1.getTitle() + " by " + book1.getAuthor());
    }
}
