package com.twu.biblioteca;

import com.twu.model.Book;
import com.twu.model.BookList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {
    public static final String OPTION_MENU_1 = "1";
    public static final String OPTION_MENU_2 = "C";
    public static final String OPTION_MENU_3 = "R";
    public static final String OPTION_MENU_4 = "L";
    public static final String OPTION_QUIT = "Quit";
    public static BookList books = new BookList();

    public static void main(String[] args) {
        ShowHelloWorldMessage();
        ShowMenuOptions();
    }

    public static void ShowHelloWorldMessage() {
        System.out.println("Hello! Welcome to Leppa's Library");
    }

    public static void ShowMenuOptions(){
        System.out.println("--------------");
        System.out.println("Select a option");
        System.out.println(OPTION_MENU_1 + "- List books ");
        System.out.println("Type Quit to exit");

        GetMenuOption();
    }

    public static void ShowBookMenu(){
        System.out.println("--------------");
        System.out.println("Select a option");
        System.out.println(OPTION_MENU_2 + "- Checkout a book");
        System.out.println(OPTION_MENU_3 + "- Return a book");
        System.out.println(OPTION_MENU_4 + "- List Available books");
        System.out.println("Type Quit to exit");

        GetMenuOption();
    }

    public static void GetMenuOption() {
        String option = ReadLine();
        SelectMenuOption(option);
    }

    public static void SelectMenuOption(String option) {
        if (option.equals(OPTION_MENU_1) || option.equals(OPTION_MENU_4)) {
            books.addBooks();
            ListBooks();
        } else if (option.equals(OPTION_MENU_2)) {
            CheckOutBook();
        } else if (option.equals(OPTION_MENU_3)) {
            ReturnBook();
        } else if(option.equals(OPTION_QUIT)) {
            System.exit(1);
        } else {
            System.out.println("Select a valid option");
            GetMenuOption();
        }
    }

    public static Book GetBook(){
        System.out.println("\nType the book name");
        String name = ReadLine();
        return books.getBookByName(name);
    }

    public static boolean BookIsInLibrary(Book book){
        if(book != null){
            return true;
        } else {
            return false;
        }
    }

    public static void CheckOutBook() {
       Book book = GetBook();
        if(BookIsInLibrary(book)){
            book.CheckoutBook();
            System.out.println("\nThank you! Enjoy the book");
        } else {
            System.out.println("\nThat book is not available.");
        }
        ShowBookMenu();
    }

    public static void ReturnBook(){
        Book book = GetBook();
        if(BookIsInLibrary(book)){
            book.ReturnBook();
            System.out.println("\nThank you for returning the book.");
        } else {
            System.out.println("\nThat is not a valid book to return.");
        }
        ShowBookMenu();
    }

    public static void ListBooks(){
        System.out.println("List of books\n");
        System.out.println(String.format("%-40s %-40s %-30s", "Name", "Author", "Year"));
        for (Book book : books.getBooks()) {
            if(book.getAvaiable()){
                System.out.println(String.format("%-40s %-40s %-30s",book.getName(), book.getAuthor() , book.getYear()));
            }
        }

        ShowBookMenu();
    }

    public static String ReadLine() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
