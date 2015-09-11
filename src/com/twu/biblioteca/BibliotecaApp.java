package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {
    public static final String OPTION_MENU_1 = "1";

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

        String option = ReadLine();

        SelectMenuOption(option);
    }

    public static String SelectMenuOption(String option){
        if (option.equals(OPTION_MENU_1)) {
            return "The option selected is: List Books";
        } else {
            return "Select a valid option";
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
