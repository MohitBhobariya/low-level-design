package BookMyShowLLD;

import BookMyShowLLD.Enums.SeatCategory;

public class Seat {
    private long id;
    private boolean isEmpty;
    private Integer price;
    private User user;
    private SeatCategory seatCategory;

    public Seat(long id, Integer price, SeatCategory seatCategory) {
        this.id = id;
        this.price = price;
        this.isEmpty = true;
        this.user = null;
        this.seatCategory = seatCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
