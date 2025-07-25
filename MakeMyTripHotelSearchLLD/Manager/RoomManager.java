package MakeMyTripHotelSearchLLD.Manager;

import MakeMyTripHotelSearchLLD.Room.Room;
import MakeMyTripHotelSearchLLD.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class RoomManager {
    private List<Room> roomList;

    public RoomManager(List<Room> roomList) {
        this.roomList = roomList;
        System.out.println("Room manager created with rooms " + roomList.size());
    }

    public void addRoom(Room room) {
        System.out.println("Going to add room");
        roomList.add(room);
        System.out.println("New room added, now total rooms are " + roomList.size());
    }

    public void removeRoom(Room room) {
        roomList = roomList.stream().filter(r -> r.getId() != room.getId()).collect(Collectors.toList());
    }

    public void updateRoom(Room room) {
        // update operations
    }

    public void bookRoom(Room room, User user) {
        Optional<Room> roomToBeBooked = roomList.stream().filter(r -> r.getId() == room.getId()).findFirst();
        if (roomToBeBooked.isPresent()) {
            System.out.println("Room availabe, going to book room");
            roomToBeBooked.get().bookRoom(user);
            System.out.println("Room booked successfully");
        } else {
            System.out.println("Room is not available");
        }
    }
}
