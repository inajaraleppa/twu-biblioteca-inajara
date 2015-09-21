package com.twu.biblioteca;

import com.twu.model.Book;

/**
 * Created by ileppa on 9/21/15.
 */
public class LibraryBook {
    public static void ShowBookMenu(){
        System.out.println("--------------");
        System.out.println("Select a option");
        System.out.println(BibliotecaApp.OPTION_MENU_2 + "- Checkout a book");
        System.out.println(BibliotecaApp.OPTION_MENU_3 + "- Return a book");
        System.out.println(BibliotecaApp.OPTION_MENU_4 + "- List Available books");
        System.out.println("Type Quit to exit");

        BibliotecaApp.GetMenuOption();
    }

    public static void GetBooks(){
        BibliotecaApp.books.addBooks();
    }

    public static void GetBook(){
        System.out.println("\nType the book name");
        BibliotecaApp.library.search = BibliotecaApp.ReadLine();
    }

    public static void CheckOutBook() {
        GetBook();
        boolean result = BibliotecaApp.library.checkout(BibliotecaApp.books);
        if(result) {
            System.out.println("\nThank you! Enjoy the book");
        } else {
            System.out.println("\nThat book is not available.");
        }
        ShowBookMenu();
    }

    public static void ReturnBook(){
        GetBook();
        boolean result = BibliotecaApp.library.returnItem(BibliotecaApp.books);
        if(result) {
            System.out.println("\nThank you for returning the book.");
        } else {
            System.out.println("\nThat is not a valid book to return.");
        }
        ShowBookMenu();
    }

    public static void ListBooks(){
        System.out.println("List of books\n");
        System.out.println(String.format("%-40s %-40s %-30s", "Name", "Author", "Year"));
        for (Book book : BibliotecaApp.books.getBooks()) {
            if(book.getAvaiable()){
                System.out.println(String.format("%-40s %-40s %-30s",book.getName(), book.getAuthor() , book.getYear()));
            }
        }

        ShowBookMenu();
    }
}
