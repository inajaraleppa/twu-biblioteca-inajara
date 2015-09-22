package com.twu.model;

import com.twu.biblioteca.XMLClass;
import com.twu.interfaces.LibraryOperations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileppa on 9/22/15.
 */
public class MovieList implements LibraryOperations {
    public List<Movie> MoviesList = new ArrayList<>();
    public String search;

    public List<Movie> getMovies(){
        return MoviesList;
    }

    public void addMovies(){
        XMLClass xml = new XMLClass();
        MoviesList =  xml.unMarshal("movies", Movies.class).getMovies();
    }

    @Override
    public void checkoutItem(int position) {
        MoviesList.get(position).Available = false;
    }

    @Override
    public void returnItem(int position) {
        MoviesList.get(position).Available = true;
    }

    @Override
    public int getByName(String name) {
        for (Movie movie : MoviesList) {
            if (movie.getName().equals(name)) {
                return MoviesList.indexOf(movie);
            }
        }
        return -1;
    }
}
