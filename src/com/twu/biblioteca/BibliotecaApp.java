package com.twu.biblioteca;

import com.twu.model.BookList;
import com.twu.model.Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {
    public static final String OPTION_MENU_1 = "1";
    public static final String OPTION_MENU_5 = "2";
    public static final String OPTION_MENU_2 = "C";
    public static final String OPTION_MENU_3 = "R";
    public static final String OPTION_MENU_4 = "L";
    public static final String OPTION_QUIT = "Quit";
    public static BookList books = new BookList();
    public static Library library = new Library();

    public static void main(String[] args) {
        LibraryBook.GetBooks();
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
        System.out.println(OPTION_MENU_5 + "- List movies");
        System.out.println("Type Quit to exit");

        GetMenuOption();
    }

    public static void GetMenuOption() {
        String option = ReadLine();
        SelectMenuOption(option);
    }

    public static void SelectMenuOption(String option) {
        if (option.equals(OPTION_MENU_1) || option.equals(OPTION_MENU_4)) {
            LibraryBook.ListBooks();
        } else if (option.equals(OPTION_MENU_2)) {
            LibraryBook.CheckOutBook();
        } else if (option.equals(OPTION_MENU_3)) {
            LibraryBook.ReturnBook();
        } else if(option.equals(OPTION_QUIT)) {
            System.exit(1);
        } else {
            System.out.println("Select a valid option");
            GetMenuOption();
        }
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
