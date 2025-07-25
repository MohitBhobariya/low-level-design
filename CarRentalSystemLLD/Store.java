package CarRentalSystemLLD;

import CarRentalSystemLLD.Enum.VehicleType;
import CarRentalSystemLLD.Vehicles.Vehicle;

import java.util.List;

public class Store {
    private int id;
    private Location location;
    private VehicleInventoryManager inventoryManager;
    private List<ReservationData> reservationData;

    public void storeVehicles(List<Vehicle> vehicleList) {
        this.inventoryManager = new VehicleInventoryManager(vehicleList);
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventoryManager.getAllVehicles();
    }

    public ReservationData createReservation(Vehicle vehicle, User user) {
        ReservationData reservation = new ReservationData(vehicle, user);
        reservationData.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

}
