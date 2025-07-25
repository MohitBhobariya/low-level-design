package MakeMyTripHotelSearchLLD;

import MakeMyTripHotelSearchLLD.Enum.RoomType;
import MakeMyTripHotelSearchLLD.Enum.SharingType;
import MakeMyTripHotelSearchLLD.Manager.DoubleRoomManager;
import MakeMyTripHotelSearchLLD.Manager.SingleRoomManager;
import MakeMyTripHotelSearchLLD.Room.DoubleRoom;
import MakeMyTripHotelSearchLLD.Room.Room;
import MakeMyTripHotelSearchLLD.Room.SingleRoom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Room> singleRooms = createSingelRooms();
        List<Room> doubleRooms = createDoubleRooms();
        SingleRoomManager singleRoomManager = new SingleRoomManager(singleRooms);
        DoubleRoomManager doubleRoomManager = new DoubleRoomManager(doubleRooms);
        List<Hotel> hotels = createHotels(singleRoomManager, doubleRoomManager);
        List<User> users = createUsers();


        MakeMyTripHotelSearch makeMyTripHotelSearch = new MakeMyTripHotelSearch(hotels, users);
        Location location = new Location("Gurgaon", "Haryana", "122007");
        Optional<Hotel> hotel = makeMyTripHotelSearch.getHotel(location);
        hotel.get().bookRoom(singleRooms.get(0), users.get(0));
        Bill bill = new Bill(new Date(), users.get(0), singleRooms.get(0), 4);
        System.out.println("Booking Details " + bill);
    }

    private static List<User> createUsers() {
        User user1 = new User("Mohit", "904100", "Abohar");
        User user2 = new User("Amit", "99833", "Abohar");
        return new ArrayList<>(Arrays.asList(user1, user2));
    }

    private static List<Hotel> createHotels(SingleRoomManager singleRoomManager, DoubleRoomManager doubleRoomManager) {
        Location location1 = new Location("Gurgaon", "Haryana", "122007");
        Hotel hotel1 = new Hotel(location1, singleRoomManager, doubleRoomManager);
        Location location2 = new Location("Noida", "UP", "14344");
        Hotel hotel2 = new Hotel(location2, singleRoomManager, doubleRoomManager);
        return new ArrayList<>(Arrays.asList(hotel1, hotel2));
    }


    private static List<Room> createSingelRooms() {

        Room room1 = new SingleRoom(1, RoomType.PREMIUM, SharingType.SINGLE_SHARING);
        Room room2 = new SingleRoom(2, RoomType.STANDARD, SharingType.SINGLE_SHARING);
        return new ArrayList<>(Arrays.asList(room1, room2));
    }

    private static List<Room> createDoubleRooms() {
        Room room1 = new DoubleRoom(1, RoomType.PREMIUM, SharingType.DOUBLE_SHARING);
        Room room2 = new DoubleRoom(2, RoomType.STANDARD, SharingType.DOUBLE_SHARING);
        return new ArrayList<>(Arrays.asList(room1, room2));
    }

}
