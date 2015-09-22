package com.twu.biblioteca;

import com.twu.model.Movie;
import com.twu.model.MovieList;

/**
 * Created by ileppa on 9/21/15.
 */
public class LibraryMovie {

    public static MovieList movies = new MovieList();

    public static void GetMovies(){
        movies.addMovies();
    }

    public static void GetMovie(){
        System.out.println("\nType the movie name");
        BibliotecaApp.library.search = BibliotecaApp.ReadLine();
    }

    public static void CheckoutMovie() {
        GetMovie();
        boolean result = BibliotecaApp.library.checkout(movies);
        if(result) {
            System.out.println("\nThank you! Enjoy the movie");
        } else {
            System.out.println("\nThat movie is not available.");
        }
        MenuOptions.ShowMainMenuOptions();
    }

    public static void ReturnMovie(){
        GetMovie();
        boolean result = BibliotecaApp.library.returnItem(movies);
        if(result) {
            System.out.println("\nThank you for returning the movie.");
        } else {
            System.out.println("\nThat is not a valid movie to return.");
        }
        MenuOptions.ShowMainMenuOptions();
    }

    public static void ListMovies(){
        System.out.println("List of movies\n");
        System.out.println(String.format("%-40s %-40s %-30s %-40s", "Name", "Director", "Year", "Rating"));
        for (Movie movie : movies.getMovies()) {
            if(movie.isAvailable()){
                System.out.println(String.format("%-40s %-40s %-30s %-40s",movie.getName(), movie.getDirector() , movie.getYear(), movie.getRating()));
            }
        }

        MenuOptions.ShowMenu("movie");
    }
}
