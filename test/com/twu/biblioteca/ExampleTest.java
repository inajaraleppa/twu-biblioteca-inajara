package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testOptionListBooksMenu() {
        assertEquals("The option selected is: List Books", BibliotecaApp.SelectMenuOption("1"));
    }

    @Test
    public void testName() throws Exception {


    }
}
