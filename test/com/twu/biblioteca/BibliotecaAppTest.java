package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ileppa on 9/11/15.
 */
public class BibliotecaAppTest {

    @Test
    public void testOptionListBooksMenu() {
        assertEquals("The option selected is: List Books", BibliotecaApp.SelectMenuOption("1"));
    }

    @Test
    public void testInvalidOptionMenu() {
        assertEquals("Select a valid option", BibliotecaApp.SelectMenuOption("2"));

    }
}