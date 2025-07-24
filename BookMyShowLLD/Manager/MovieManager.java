package BookMyShowLLD.Manager;

import BookMyShowLLD.Enums.City;
import BookMyShowLLD.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieManager {

    private Map<City, List<Movie>> cityVsMovies;
    private List<Movie> allMovies;

    public MovieManager() {
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }


    //ADD movie to a particular city, make use of cityVsMovies map
    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);
        List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
    }


    public Movie getMovieByName(String movieName) {

        for (Movie movie : allMovies) {
            if ((movie.getName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }


    public List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }
    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list


}
