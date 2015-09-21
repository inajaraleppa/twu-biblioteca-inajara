package com.twu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by ileppa on 9/21/15.
 */
@XmlRootElement(name = "Movies")
@XmlAccessorType(XmlAccessType.FIELD)
public class Movies {
    @XmlElement(name = "Movie")
    private List<Movie> movies = null;

    public List<Movie> getBooks() {
        return movies;
    }

}
