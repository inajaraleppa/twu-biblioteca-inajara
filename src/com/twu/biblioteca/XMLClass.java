package com.twu.biblioteca;

import com.twu.model.Book;
import com.twu.model.Books;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileppa on 9/14/15.
 */
public class XMLClass {

    public List<Book> XMLToObject() {
        Books books = new Books();
        try {

            File file = new File("src/com/twu/resources/books.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            books =  (Books) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return books.getBooks();
    }
}
