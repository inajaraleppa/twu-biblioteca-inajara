package com.twu.biblioteca;

import com.twu.model.Book;
import com.twu.model.BookList;

/**
 * Created by ileppa on 9/21/15.
 */
public class LibraryBook {
    public static BookList books = new BookList();

    public static void GetBooks(){
        books.addBooks();
    }

    public static void GetBook(){
        System.out.println("\nType the book name");
        BibliotecaApp.library.search = BibliotecaApp.ReadLine();
    }

    public static void CheckOutBook() {
        GetBook();
        boolean result = BibliotecaApp.library.checkout(books);
        if(result) {
            System.out.println("\nThank you! Enjoy the book");
        } else {
            System.out.println("\nThat book is not available.");
        }
        MenuOptions.ShowMainMenuOptions();
    }

    public static void ReturnBook(){
        GetBook();
        boolean result = BibliotecaApp.library.returnItem(books);
        if(result) {
            System.out.println("\nThank you for returning the book.");
        } else {
            System.out.println("\nThat is not a valid book to return.");
        }
        MenuOptions.ShowMainMenuOptions();
    }

    public static void ListBooks(){
        System.out.println("List of books\n");
        System.out.println(String.format("%-40s %-40s %-30s", "Name", "Author", "Year"));
        for (Book book : books.getBooks()) {
            if(book.getAvaiable()){
                System.out.println(String.format("%-40s %-40s %-30s",book.getName(), book.getAuthor() , book.getYear()));
            }
        }

        MenuOptions.ShowMenu("book");
    }
}
