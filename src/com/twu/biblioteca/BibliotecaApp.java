package com.twu.biblioteca;

import com.twu.model.Library;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {

    public static Library library = new Library();

    public static void main(String[] args) {
        LibraryBook.GetBooks();
        LibraryMovie.GetMovies();
        ShowHelloWorldMessage();
        MenuOptions.ShowMainMenuOptions();
    }

    public static void ShowHelloWorldMessage() {
        System.out.println("Hello! Welcome to Leppa's Library");
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
