package com.twu.biblioteca;

import com.twu.model.Book;
import com.twu.model.Books;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileppa on 9/14/15.
 */
public class XMLClass {

    public <T> T unMarshal(String fileName, Class<T> clasz) {
        try {
            File file = new File("src/com/twu/resources/" + fileName + ".xml");

            JAXBContext jc = JAXBContext.newInstance( clasz );
            Unmarshaller u = jc.createUnmarshaller();
            return (T)u.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
