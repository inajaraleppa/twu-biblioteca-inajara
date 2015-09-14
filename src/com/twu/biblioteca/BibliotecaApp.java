package com.twu.biblioteca;

import com.twu.model.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    public static final String OPTION_MENU_1 = "1";
    public static final String OPTION_MENU_2 = "C";
    public static final String OPTION_MENU_3 = "R";
    public static final String OPTION_QUIT = "Quit";
    public static List<Book> books = new ArrayList<>();

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
        System.out.println("Type Quit to exit");

        GetMenuOption();
    }

    public static void GetMenuOption() {
        String option = ReadLine();
        SelectMenuOption(option);
    }

    public static void SelectMenuOption(String option) {
        if (option.equals(OPTION_MENU_1)) {
            XMLClass xml = new XMLClass();
            books = xml.XMLToObject();
            ListBooks();
        } else if (option.equals(OPTION_MENU_2)) {
        } else if (option.equals(OPTION_MENU_3)) {
        } else if(option.equals(OPTION_QUIT)) {
            System.exit(1);
        } else {
            System.out.println("Select a valid option");
            GetMenuOption();
        }
    }

    public static void ListBooks(){
        System.out.println("List of books\n");
        System.out.println(String.format("%-40s %-40s %-30s", "Name", "Author", "Year"));
        for (Book book : books) {
            System.out.println(String.format("%-40s %-40s %-30s",book.getName(), book.getAuthor() , book.getYear()));
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
