package task3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));

        // Add a user
        User user1 = new User("John");

        System.out.println("Available Books:");
        library.showBooks();

        // Issue a book
        library.issueBook("Harry Potter", user1);

        System.out.println("\nAfter issuing:");
        library.showBooks();

        // Return the book
        library.returnBook("Harry Potter", user1);

        System.out.println("\nAfter returning:");
        library.showBooks();
    }
}
