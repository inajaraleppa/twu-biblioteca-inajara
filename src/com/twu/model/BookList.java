package com.twu.model;

import com.twu.biblioteca.XMLClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileppa on 9/14/15.
 */
public class BookList {
    public List<Book> BooksList = new ArrayList<>();

    public List<Book> getBooks(){
        return BooksList;
    }

    public void addBooks(){
        XMLClass xml = new XMLClass();
        BooksList.clear();
        BooksList.addAll(xml.XMLToObject());
    }

    public Book getBookByName(String name){
        for (Book book : BooksList) {
            if(book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }

}
