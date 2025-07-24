package BookMyShowLLD;

import BookMyShowLLD.Enums.City;
import BookMyShowLLD.Enums.SeatCategory;
import BookMyShowLLD.Manager.MovieManager;
import BookMyShowLLD.Manager.TheatreManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    private final MovieManager movieManager;
    private final TheatreManager theatreManager;

    public BookMyShow() {
        movieManager = new MovieManager();
        theatreManager = new TheatreManager();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
       bookMyShow.initialize();
       bookMyShow.createBooking(City.Bangalore,"Venom");
    }

    public void createBooking(City city, String movieName) {
        List<Movie> moviesByCity = movieManager.getMoviesByCity(city);
        Movie interestedMovie = null;
        for (Movie movie : moviesByCity) {
            if ((movie.getName()).equals(movieName)) {
                interestedMovie = movie;
            }
        }
        User user = new User("Mohit", 9041004836L, City.Delhi);
        Map<Theatre, List<Shows>> allShowsOfMovie = theatreManager.getAllShowsOfMovie(interestedMovie, city);
        //4. select the particular show user is interested in
        Map.Entry<Theatre, List<Shows>> entry = allShowsOfMovie.entrySet().iterator().next();
        List<Shows> runningShows = entry.getValue();
        Shows interestedShow = runningShows.get(0);
        int seatNo = 30;
        Seat seat = interestedShow.getSeats().get(seatNo);
        if (seat.isEmpty()) {
            seat.setEmpty(false);
            seat.setUser(user);
            System.out.println("Seat booked successfully");
        } else {
            System.out.println("Seat is booked alreday");
        }

        Map.Entry<Theatre, List<Shows>> entry1 = allShowsOfMovie.entrySet().iterator().next();
        List<Shows> runningShows1 = entry1.getValue();
        Shows interestedShow1 = runningShows1.get(0);
        int seatNo1 = 30;
        Seat seat1 = interestedShow1.getSeats().get(seatNo1);
        if (seat1.isEmpty()) {
            seat1.setEmpty(false);
            seat1.setUser(user);
            System.out.println("Seat booked successfully");
        } else {
            System.out.println("Seat is booked alreday");
        }
    }

    public void initialize() {
        createMovies();
        createTheatres();
    }

    private void createTheatres() {
        Movie venom = movieManager.getMovieByName("Venom");
        Movie avengers = movieManager.getMovieByName("Avengers");
        Theatre movieTime = new Theatre();
        Theatre pvr = new Theatre();
        List<Shows> movieTimeShows = new ArrayList<>();
        List<Shows> pvrShows = new ArrayList<>();

        Shows morningShow = createShows(1, venom, 8L);
        Shows eveningShow = createShows(2, avengers, 16L);

        movieTimeShows.add(morningShow);
        movieTimeShows.add(eveningShow);

        pvrShows.add(morningShow);
        pvrShows.add(eveningShow);

        movieTime.setId(1);
        movieTime.setCity(City.Bangalore);
        movieTime.setName("MovieTime");
        movieTime.setShowsList(movieTimeShows);

        pvr.setId(2);
        pvr.setCity(City.Delhi);
        pvr.setName("PVR");
        pvr.setShowsList(pvrShows);

        theatreManager.addTheatre(City.Bangalore, movieTime);
        theatreManager.addTheatre(City.Delhi, pvr);
    }

    private void createMovies() {
        Movie venom = new Movie();
        venom.setId(1);
        venom.setName("Venom");
        venom.setDuration(128);
        Movie avengers = new Movie();
        avengers.setId(2);
        avengers.setName("Avengers");
        avengers.setDuration(122);
        movieManager.addMovie(venom, City.Delhi);
        movieManager.addMovie(venom, City.Bangalore);
        movieManager.addMovie(avengers, City.Delhi);
        movieManager.addMovie(avengers, City.Bangalore);

    }

    private Shows createShows(int showId, Movie movie, Long showStartTime) {
        Shows show = new Shows();
        show.setId(showId);
        show.setMovie(movie);
        show.setStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        show.setSeats(createSeats());
        return show;
    }

    private List<Seat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat(i, 10, SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat(i, 20, SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat(i, 30, SeatCategory.PLATINUM);
            seats.add(seat);
        }
        return seats;
    }
}
