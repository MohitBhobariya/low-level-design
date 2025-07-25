package MakeMyTripHotelSearchLLD;

import java.util.List;
import java.util.Optional;

public class MakeMyTripHotelSearch {
    private List<Hotel> hotels;
    private List<User> users;

    public MakeMyTripHotelSearch(List<Hotel> hotels, List<User> users) {
        this.hotels = hotels;
        this.users = users;
    }

    public Optional<Hotel> getHotel(Location location) {
        Optional<Hotel> hotel = hotels.stream().filter(htl -> htl.getLocation().getCity().equalsIgnoreCase(location.getCity())).findFirst();
        return hotel;
    }
}
