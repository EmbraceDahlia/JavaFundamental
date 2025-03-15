package lab11.problem3;



class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    @Override
    public String toString() {
        return String.format("Book{ISBN='%s', title='%s', author='%s', isBorrowed=%b}",
                ISBN, title, author, isBorrowed);
    }
}

