//Library Management System

package Day6.PracticeSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        if (ch == 1) {
            Library<Book> bookLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int numpages = scanner.nextInt();
                Book book = new Book(id, name, author, numpages);
                bookLibrary.addItem(book);
            }
            bookLibrary.displayItems();
        }

        else if (ch == 2) {
            Library<DVD> dvdLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int duration = scanner.nextInt();
                DVD dvd = new DVD(id, name, author, duration);
                dvdLibrary.addItem(dvd);
            }

            Library<Magazine> magazineLibrary = new Library<>();
            n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int issueno = scanner.nextInt();
                Magazine magazine = new Magazine(id, name, author, issueno);
                magazineLibrary.addItem(magazine);
            }
            dvdLibrary.displayItems();
            magazineLibrary.displayItems();
        }

        else if (ch == 3) {
            Library<Book> bookLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int numpages = scanner.nextInt();
                Book book = new Book(id, name, author, numpages);
                bookLibrary.addItem(book);
            }

            int itemId = scanner.nextInt();
            try {
                if (bookLibrary.checkOutItem(itemId)) {
                    System.out.println("Item " + itemId + " checked out successfully.");
                } else {
                    System.out.println("Item " + itemId + " not found in the library.");
                }
            } catch (ItemAlreadyCheckedOutException e) {
                System.out.println(e.getMessage());
            }
        }

        else if (ch == 4) {
            Library<Magazine> magazineLibrary = new Library<>();

            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int issueno = scanner.nextInt();
                Magazine magazine = new Magazine(id, name, author, issueno);
                magazine.checkedOut = true; // pre-marked as checked out for testing return
                magazineLibrary.addItem(magazine);
            }

            int itemId = scanner.nextInt();
            try {
                if (magazineLibrary.returnItem(itemId)) {
                    System.out.println("Item " + itemId + " returned successfully.");
                } else {
                    System.out.println("Item " + itemId + " not found in the library.");
                }
            } catch (ItemNotCheckedOutException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class LibraryItem {
    private int itemId;
    private String title;
    private String creator;
    public boolean checkedOut;

    public LibraryItem(int itemId, String title, String creator) { // constructor implemented
        this.itemId = itemId;
        this.title = title;
        this.creator = creator;
        this.checkedOut = false;
    }

    public int getItemId() { return itemId; } // getter implemented
    public String getTitle() { return title; } // getter implemented
    public String getCreator() { return creator; } // getter implemented

    public boolean isCheckedOut() { return checkedOut; }

    public void checkOut() { // exception logic added
        if (checkedOut) throw new ItemAlreadyCheckedOutException(itemId);
        checkedOut = true;
    }

    public void returnItem() { // exception logic added
        if (!checkedOut) throw new ItemNotCheckedOutException(itemId);
        checkedOut = false;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nCreator: " + creator + "\nChecked Out: " + checkedOut;
    }
}

class ItemAlreadyCheckedOutException extends RuntimeException { // new exception class added
    public ItemAlreadyCheckedOutException(int itemId) {
        super("Item " + itemId + " is already checked out");
    }
}

class ItemNotCheckedOutException extends RuntimeException { // new exception class added
    public ItemNotCheckedOutException(int itemId) {
        super("Item " + itemId + " is not checked out");
    }
}

class Book extends LibraryItem {
    private int numPages;

    public Book(int itemId, String title, String author, int numPages) { // constructor implemented
        super(itemId, title, author);
        this.numPages = numPages;
    }

    public int getNumPages() { return numPages; } // getter implemented

    @Override
    public String toString() {
        return super.toString() + "\nType: Book\nNumber of Pages: " + numPages;
    }
}

class DVD extends LibraryItem {
    private int duration;

    public DVD(int itemId, String title, String director, int duration) { // constructor implemented
        super(itemId, title, director);
        this.duration = duration;
    }

    public int getDuration() { return duration; } // getter implemented

    @Override
    public String toString() {
        return super.toString() + "\nType: DVD\nDuration: " + duration + " minutes";
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int itemId, String title, String publisher, int issueNumber) { // constructor implemented
        super(itemId, title, publisher);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() { return issueNumber; } // getter implemented

    @Override
    public String toString() {
        return super.toString() + "\nType: Magazine\nIssue Number: " + issueNumber;
    }
}

class Library<T extends LibraryItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
            System.out.println("-------------");
        }
    }

    public boolean checkOutItem(int itemId) { // implemented checkout logic
        T item = findItem(itemId);
        if (item != null) {
            item.checkOut();
            return true;
        }
        return false;
    }

    public boolean returnItem(int itemId) { // implemented return logic
        T item = findItem(itemId);
        if (item != null) {
            item.returnItem();
            return true;
        }
        return false;
    }

    private T findItem(int itemId) { // implemented search logic
        for (T item : items) {
            if (item.getItemId() == itemId) return item;
        }
        return null;
    }
}
