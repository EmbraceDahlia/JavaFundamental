package lab10.problem3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> library;

    Library(){
        this.library = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){

        //check if ISBN exists


        library.put(ISBN, new Book(ISBN, title, author));
        System.out.println("Book added succesfully");


    }


}
