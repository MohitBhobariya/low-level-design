package CarRentalSystemLLD;

import CarRentalSystemLLD.Vehicles.Vehicle;

import java.util.List;

public class VehicleInventoryManager {
    private List<Vehicle> vehicleList;

    public VehicleInventoryManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {

    }
}
