package lab11.problem3;

public class TestMain {

    public static void main(String[] args) {

        Library lib = new Library();
        printSectionHeader("Adding books");
        lib.addBook("12345", "Java Programming", "Dahlia ");
        lib.addBook("67890", "Data Structures", " Gideon");

        printSectionHeader("Adding duplicate book");
        lib.addBook("12345", "Duplicate Book", "Someone Else");

        printSectionHeader("Listing all books");
        lib.listAllBooks();

        printSectionHeader("Borrowing books");
        lib.borrowBook("12345");
        lib.borrowBook("67890");

        printSectionHeader("Attempting to borrow a non-existing book");
        lib.borrowBook("11111");

        printSectionHeader("Listing borrowed books");
        lib.listBorrowedBooks();

        printSectionHeader("Checking if a book is borrowed");
        boolean isBorrowed = lib.isBookBorrowed("12345");
        System.out.println("Is '12345' borrowed? " + isBorrowed);

        printSectionHeader("Returning books");
        lib.returnBook("12345");
        lib.returnBook("67890");

        printSectionHeader("Listing all books after returns");
        lib.listAllBooks();

        printSectionHeader("Getting details of a single book");
        lib.getBookDetails("12345");
    }

    // Utility method to format section headers
    private static void printSectionHeader(String title) {
        System.out.println("\n--------------- " + title + " ---------------\n");
    }
}




