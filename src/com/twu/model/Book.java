package com.twu.model;

import sun.security.x509.AVA;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ileppa on 9/14/15.
 */
@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    String Name;
    String Author;
    String Year;
    boolean Available;

    public Book(){}

    public Book(String name, String author, String year, boolean available) {
        Name = name;
        Author = author;
        Year = year;
        Available = available;
    }

    public boolean getAvaiable(){
        return Available;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getYear() {
        return Year;
    }


}
