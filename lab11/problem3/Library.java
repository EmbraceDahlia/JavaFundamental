package lab11.problem3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books;

    Library() {
        this.books = new HashMap<>();
    }


    public void addBook(String ISBN, String title, String author) {

        //check if ISBN exists
        if (books.containsKey(ISBN)) {
            System.out.printf("Book with ISBN %s already exists%n", ISBN);
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.printf("%s book added. %n",title);
        }

    }


    public void borrowBook(String ISBN) {
        //check if book is already borrowed
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
            return;
        }
        Book book = books.get(ISBN);
        if (book.isBorrowed()) {
            System.out.printf("%s book has already been borrowed %n", book.getTitle());
        } else {
            book.setBorrowed(true);
            System.out.printf("%s book has been borrowed successfully. %n", book.getTitle());

        }

    }


    public void returnBook(String ISBN) {
        if(ISBN == null) return;
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
            return;
        }
        Book book = books.get(ISBN);
        if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.printf("%s book has been returned.%n", book.getTitle());

        } else {
            System.out.printf("%s book is not borrowed.%n", book.getTitle());

        }

    }

    public boolean isBookBorrowed(String ISBN) {
        return books.containsKey(ISBN) && books.get(ISBN).isBorrowed();
    }


    public void getBookDetails(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " does not exist in the library.");
        } else {

            System.out.printf("Details of ISBN %s: %s",ISBN,books.get(ISBN));
        }
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for(Book b : books.values() ){
                System.out.println(b);
            }

//            books.values().forEach(System.out::println);
        }
    }

    public void listBorrowedBooks() {
        boolean found = false;
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No borrowed books.");
        }
    }


    @Override
    public String toString() {
        if (books.isEmpty()) return "Library is empty.";

        StringBuilder sb = new StringBuilder();
        sb.append("\nLibrary contains:\n");

        for (Book book : books.values()) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }


}
