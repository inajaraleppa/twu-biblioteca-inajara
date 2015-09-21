package com.twu.model;

import com.twu.biblioteca.BibliotecaApp;
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
    List<Book> books = new ArrayList<>();
    BookList booksList = new BookList();

    @Before
    public void setUp() {
        booksList.addBooks();

        book = new Book("The book thief", "markus zusak", "2013", true);

        books.add(new Book("The book thief", "Inajara", "2002", true));
        books.add(new Book("Alice in wonderland", "João", "1993", true));
        books.add(new Book("Head First - Java", "O tio", "2007", true));
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
        List<Book> books1 = xml.unMarshal("books", Books.class).getBooks();
        assertTrue(books1.size() == books.size());
    }

    @Test
    public void testBooks() {
        List<Book> books1 = booksList.getBooks();
        assertTrue(books1.get(0).getName().equals(books.get(0).getName()) &&
                books1.get(0).getAuthor().equals(books.get(0).getAuthor()) &&
                books1.get(0).getYear().equals(books.get(0).getYear()) &&
                books1.get(0).getAvaiable() == books.get(0).getAvaiable()
        );
    }

    @Test
    public void testCheckoutBook(){
        booksList.checkoutItem(0);
        assertFalse(booksList.BooksList.get(0).getAvaiable());
    }

    @Test
    public void testReturnBook() {
        booksList.checkoutItem(1);
        assertFalse(booksList.BooksList.get(1).getAvaiable());
        booksList.returnItem(1);
        assertTrue(booksList.BooksList.get(1).getAvaiable());
    }
}