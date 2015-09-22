package com.twu.model;

import com.twu.biblioteca.XMLClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ileppa on 9/22/15.
 */
public class MovieTest {

    Movie movie;
    List<Movie> movies = new ArrayList<>();
    MovieList moviesList = new MovieList();

    @Before
    public void setUp() {
        moviesList.addMovies();

        movies.add(new Movie("The book thief", "2013", "" , "6", true));
        movies.add(new Movie("Mulan", "2003", "" , "9", true));
        movies.add(new Movie("Mogli", "2001", "" , "8", true));
    }


    @Test
    public void testXMLtoObject() {
        XMLClass xml = new XMLClass();
        List<Movie> movies1 = xml.unMarshal("movies", Movies.class).getMovies();
        assertTrue(movies1.size() == movies.size());
    }

    @Test
    public void testmovies() {
        List<Movie> movies1 = moviesList.getMovies();
        assertTrue(movies1.get(0).getName().equals(movies.get(0).getName()) &&
                        movies1.get(0).getDirector().equals(movies.get(0).getDirector()) &&
                        movies1.get(0).getYear().equals(movies.get(0).getYear()) &&
                        movies1.get(0).isAvailable() == movies.get(0).isAvailable() &&
                        movies1.get(0).getRating().equals(movies.get(0).getRating())
        );
    }

    @Test
    public void testCheckoutmovie(){
        moviesList.checkoutItem(0);
        assertFalse(moviesList.MoviesList.get(0).isAvailable());
    }

    @Test
    public void testReturnmovie() {
        moviesList.checkoutItem(1);
        assertFalse(moviesList.MoviesList.get(1).isAvailable());
        moviesList.returnItem(1);
        assertTrue(moviesList.MoviesList.get(1).isAvailable());
    }
}
