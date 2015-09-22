package com.twu.biblioteca;

/**
 * Created by ileppa on 9/22/15.
 */
public class MenuOptions {

    public static final String OPTION_MENU_BOOKS = "1";
    public static final String OPTION_MENU_MOVIES = "2";
    public static final String OPTION_MENU_CHECKOUT = "C";
    public static final String OPTION_MENU_RETURN = "R";
    public static final String OPTION_MENU_LIST = "L";
    public static final String OPTION_QUIT = "Quit";
    public static final String OPTION_MENU = "Menu";
    public static final String OPTION_LOGIN = "Login";
    public static final String OPTION_LOGOUT = "Logout";
    public static String SELECTED_MENU = "";

    public static void ShowMainMenuOptions(){
        System.out.println("--------------");
        System.out.println("Select a option");
        System.out.println(OPTION_MENU_BOOKS + " - List books ");
        System.out.println(OPTION_MENU_MOVIES + " - List movies");
        if(BibliotecaApp.user.isLogged()){
            System.out.println(OPTION_LOGOUT);
        } else {
            System.out.println(OPTION_LOGIN);
        }
        System.out.println("Type Quit to exit");

        GetMenuOption();
    }

    public static void ShowMenu(String menu){
        System.out.println("--------------");
        System.out.println("Select a option");
        if(BibliotecaApp.user.isLogged()) {
            System.out.println(OPTION_MENU_CHECKOUT + " - Checkout a " + menu);
            System.out.println(OPTION_MENU_RETURN + " - Return a " + menu);
        }
        System.out.println(OPTION_MENU_LIST + " - List Available " + menu);
        System.out.println(OPTION_MENU + " - Return to main menu");
        System.out.println("Type Quit to exit");

        GetMenuOption();
    }

    public static void GetMenuOption() {
        String option = BibliotecaApp.ReadLine();
        SelectMenuOption(option);
    }

    public static void SelectMenuOption(String option) {
        if (option.equals(OPTION_MENU_BOOKS)) {
            SELECTED_MENU = option;
            LibraryBook.ListBooks();
        } else if(option.equals(OPTION_MENU_MOVIES)){
            SELECTED_MENU = option;
            LibraryMovie.ListMovies();
        } else if (SELECTED_MENU.equals(OPTION_MENU_BOOKS) && option.equals(OPTION_MENU_CHECKOUT)) {
            LibraryBook.CheckOutBook();
        } else if (SELECTED_MENU.equals(OPTION_MENU_BOOKS) && option.equals(OPTION_MENU_RETURN)) {
            LibraryBook.ReturnBook();
        } else if (SELECTED_MENU.equals(OPTION_MENU_MOVIES) && option.equals(OPTION_MENU_RETURN)) {
            LibraryMovie.ReturnMovie();
        } else if (SELECTED_MENU.equals(OPTION_MENU_MOVIES) && option.equals(OPTION_MENU_CHECKOUT)) {
            LibraryMovie.CheckoutMovie();
        } else if (SELECTED_MENU.equals(OPTION_MENU_BOOKS) && option.equals(OPTION_MENU_LIST)) {
            LibraryBook.ListBooks();
        } else if (SELECTED_MENU.equals(OPTION_MENU_MOVIES) && option.equals(OPTION_MENU_LIST)) {
            LibraryMovie.ListMovies();
        } else if(option.equals(OPTION_QUIT)) {
            System.exit(1);
        } else if(option.equals(OPTION_MENU)) {
            ShowMainMenuOptions();
        } else if(option.equals(OPTION_LOGIN)) {
            BibliotecaUser.Login();
        } else if(option.equals(OPTION_LOGOUT)) {
            BibliotecaUser.Logout();
        } else {
            System.out.println("Select a valid option");
            GetMenuOption();
        }
    }
}
