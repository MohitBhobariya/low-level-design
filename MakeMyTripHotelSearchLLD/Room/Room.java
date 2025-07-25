package MakeMyTripHotelSearchLLD.Room;

import MakeMyTripHotelSearchLLD.Enum.RoomType;
import MakeMyTripHotelSearchLLD.Enum.SharingType;
import MakeMyTripHotelSearchLLD.User;

public abstract class Room {
    private int id;
    private RoomType roomType;
    private SharingType sharingType;
    private int price;
    private boolean isAvailable;
    private User user;
    private boolean hasBalcony;

    public Room(int id, RoomType roomType, SharingType sharingType) {
        this.id = id;
        this.roomType = roomType;
        this.hasBalcony = false;
        this.isAvailable = true;
        this.user = null;
        this.price = 10;
        this.sharingType = sharingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public SharingType getSharingType() {
        return sharingType;
    }

    public void setSharingType(SharingType sharingType) {
        this.sharingType = sharingType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void bookRoom(User user) {
        this.isAvailable = false;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomType=" + roomType +
                ", sharingType=" + sharingType +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", user=" + user +
                ", hasBalcony=" + hasBalcony +
                '}';
    }
}
