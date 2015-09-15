package com.twu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by ileppa on 9/14/15.
 */
@XmlRootElement(name = "Books")
@XmlAccessorType(XmlAccessType.FIELD)
public class Books {
    @XmlElement(name = "Book")
    private List<Book> books = null;

    public List<Book> getBooks() {
        return books;
    }
}
