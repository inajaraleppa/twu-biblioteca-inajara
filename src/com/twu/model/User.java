package com.twu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ileppa on 9/22/15.
 */
@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    String Name;
    String Password;
    String Login;
    String Email;
    String Phone;
    boolean IsLogged;

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getLogin() {
        return Login;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public boolean isLogged() {
        return IsLogged;
    }

    public void loginUser(){
        IsLogged = true;
    }

    public void logoutUser(){
        IsLogged = false;
    }
}
