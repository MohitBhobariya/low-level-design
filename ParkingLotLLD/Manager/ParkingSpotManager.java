package ParkingLotLLD.Manager;

import ParkingLotLLD.ParkingLots.FourWheelerParkingSpot;
import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingLots.TwoWheelerParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;
import ParkingLotLLD.Vehicles.Vehicle;

import java.util.List;
import java.util.Objects;

public abstract class ParkingSpotManager {
    public List<ParkingSpot> parkingSpots;
    public ParkingStrategy parkingStrategy;

    public ParkingSpotManager() {
    }

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot.id);
    }

    public ParkingSpot findParkingSpot() {
        return parkingStrategy.findParkingSpot();
    }

    public void addVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.addVehicle(vehicle);

    }

    public void removeVehicle(Vehicle v) {
        for (ParkingSpot ps : parkingSpots) {
            if (!ps.isEmpty && Objects.equals(ps.vehicle.vehicleNumber, v.vehicleNumber)) {
                ps.removeVehicle();
                break;
            }
        }
    }

    public void printParkingSpots() {
        int size = parkingSpots.size();
        System.out.println("Size : " + size);
        for (int i = 0; i < parkingSpots.size(); i++) {
            System.out.println(parkingSpots.get(i));
        }
    }
}
