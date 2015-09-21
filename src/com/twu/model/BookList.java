package com.twu.model;

import com.twu.biblioteca.XMLClass;
import com.twu.interfaces.LibraryOperations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileppa on 9/14/15.
 */
public class BookList implements LibraryOperations {
    public List<Book> BooksList = new ArrayList<>();
    public String search;

    public List<Book> getBooks(){
        return BooksList;
    }

    public String getSearch(){
        return search;
    }

    public void addBooks(){
        XMLClass xml = new XMLClass();
        BooksList =  xml.unMarshal("books", Books.class).getBooks();
    }

    @Override
    public void checkoutItem(int position) {
        BooksList.get(position).Available = false;
    }

    @Override
    public void returnItem(int position) {
        BooksList.get(position).Available = true;
    }

    @Override
    public int getByName(String name) {
        for (Book book : BooksList) {
            if (book.getName().equals(name)) {
                return BooksList.indexOf(book);
            }
        }
        return -1;
    }
}
