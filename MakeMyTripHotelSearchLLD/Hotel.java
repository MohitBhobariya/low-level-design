package MakeMyTripHotelSearchLLD;


import MakeMyTripHotelSearchLLD.Manager.DoubleRoomManager;
import MakeMyTripHotelSearchLLD.Manager.SingleRoomManager;
import MakeMyTripHotelSearchLLD.Room.DoubleRoom;
import MakeMyTripHotelSearchLLD.Room.Room;
import MakeMyTripHotelSearchLLD.Room.SingleRoom;

public class Hotel {
    private SingleRoomManager singleRoomManager;
    private DoubleRoomManager doubleRoomManager;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public Hotel(Location location, SingleRoomManager singleRoomManager, DoubleRoomManager doubleRoomManager) {
        this.singleRoomManager = singleRoomManager;
        this.doubleRoomManager = doubleRoomManager;
        this.location = location;
    }

    public void bookRoom(Room room, User user) {
        if (room instanceof SingleRoom) {
            singleRoomManager.bookRoom(room, user);
        } else if (room instanceof DoubleRoom) {
            doubleRoomManager.bookRoom(room, user);
        } else {
            System.out.println("Unknown Room Type");
        }
    }

}
