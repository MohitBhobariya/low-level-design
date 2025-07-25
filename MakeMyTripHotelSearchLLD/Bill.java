package MakeMyTripHotelSearchLLD;

import MakeMyTripHotelSearchLLD.Room.Room;

import java.util.Date;

public class Bill {
    private Date bookingDate;
    private User user;
    private Room room;
    private int days;

    public Bill(Date bookingDate, User user, Room room, int days) {
        this.bookingDate = bookingDate;
        this.user = user;
        this.room = room;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bookingDate=" + bookingDate +
                ", user=" + user +
                ", room=" + room +
                ", days=" + days +
                '}';
    }
}
