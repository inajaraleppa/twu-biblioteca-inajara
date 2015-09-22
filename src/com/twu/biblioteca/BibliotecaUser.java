package com.twu.biblioteca;

import com.twu.model.User;
import com.twu.model.Users;

/**
 * Created by ileppa on 9/22/15.
 */
public class BibliotecaUser {
    static Users users = new Users();

    public static void Login(){
        users.getUsers();

        System.out.println("Login:");
        String login = BibliotecaApp.ReadLine();
        System.out.println("Senha:");
        String password = BibliotecaApp.ReadLine();

        UserExists(login,password);
    }

    public static void Logout(){
        BibliotecaApp.user.logoutUser();
        MenuOptions.ShowMainMenuOptions();
        BibliotecaApp.user = new User();
    }

    public static void UserExists(String login, String password){
        User user = users.getUser(login, password);
        if(user != null){
            BibliotecaApp.user = user;
            BibliotecaApp.user.loginUser();
        } else {
            System.out.println("Invalid login or password");
        }

        MenuOptions.ShowMainMenuOptions();
    }
}
