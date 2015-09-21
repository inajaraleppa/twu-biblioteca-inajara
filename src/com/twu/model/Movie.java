package com.twu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ileppa on 9/21/15.
 */
@XmlRootElement(name = "Movie")
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie {
    String Name;
    String Director;
    String Year;
    String Rating;
    boolean Available;

    public Movie(){}

    public Movie(String name, String director, String rating, String year, boolean available) {
        Name = name;
        Director = director;
        Rating = rating;
        Year = year;
        Available = available;
    }
}
