package com.twu.model;

import com.twu.biblioteca.XMLClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ileppa on 9/14/15.
 */
public class BookTest {

    Book book;
    List<Book> books;

    @Before
    public void setUp() {
        book = new Book("The book thief", "markus zusak", "2013");
        books = new ArrayList<>();
        books.add(new Book("The book thief", "", ""));
        books.add(new Book("Alice in wonderland", "", ""));
        books.add(new Book("Head First - Java", "", ""));
    }

    @Test
    public void testGetName() {
        assertEquals("The book thief", book.getName());
    }

    @Test
    public void testGetAuthor(){
        assertEquals("markus zusak", book.getAuthor());
    }

    @Test
    public void testGetYear() {
        assertEquals("2013", book.getYear());
    }

    @Test
    public void testXMLtoObject() {
        XMLClass xml = new XMLClass();
        List<Book> books1 = xml.XMLToObject();
        assertTrue(books1.size() == books.size());
    }
}