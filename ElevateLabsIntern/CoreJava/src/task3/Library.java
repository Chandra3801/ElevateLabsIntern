package task3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public boolean issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issue();
                System.out.println(user.getName() + " has issued \"" + book.getTitle() + "\"");
                return true;
            }
        }
        System.out.println("Book not available for issuing.");
        return false;
    }

    public boolean returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println(user.getName() + " has returned \"" + book.getTitle() + "\"");
                return true;
            }
        }
        System.out.println("Book not available for returning.");
        return false;
    }
}
