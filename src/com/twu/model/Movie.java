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

    public Movie(String name, String year, String director, String rating, boolean available) {
        Name = name;
        Director = director;
        Rating = rating;
        Year = year;
        Available = available;
    }

    public String getName() {
        return Name;
    }

    public String getDirector() {
        return Director;
    }

    public String getYear() {
        return Year;
    }

    public String getRating() {
        return Rating;
    }

    public boolean isAvailable() {
        return Available;
    }
}
