package BookMyShowLLD.Manager;

import BookMyShowLLD.Enums.City;
import BookMyShowLLD.Movie;
import BookMyShowLLD.Seat;
import BookMyShowLLD.Shows;
import BookMyShowLLD.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreManager {
    private Map<City, List<Theatre>> cityVsTheatres;

    public TheatreManager() {
        cityVsTheatres = new HashMap<>();
    }

    public void addTheatre(City city, Theatre theatre) {
        List<Theatre> theatreList = cityVsTheatres.getOrDefault(city, new ArrayList<>());
        theatreList.add(theatre);
        cityVsTheatres.put(city, theatreList);
    }

    public Map<Theatre, List<Shows>> getAllShowsOfMovie(Movie movie, City city) {
        List<Theatre> theatresOfCity = cityVsTheatres.get(city);
        Map<Theatre, List<Shows>> showsOfMovie = new HashMap<>();
        for (Theatre theatre : theatresOfCity) {
            List<Shows> showsForCurrentTheatre = new ArrayList<>();
            List<Shows> shows = theatre.getShowsList();
            for (Shows show : shows) {
                if (show.getMovie().getId() == movie.getId()) {
                    showsForCurrentTheatre.add(show);
                }
            }
            if (!showsForCurrentTheatre.isEmpty()) {
                showsOfMovie.put(theatre, showsForCurrentTheatre);
            }
        }
        return showsOfMovie;
    }
}
