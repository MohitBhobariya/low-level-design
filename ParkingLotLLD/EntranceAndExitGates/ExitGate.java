package ParkingLotLLD.EntranceAndExitGates;

import ParkingLotLLD.Factory.ParkingSpotManagerFactory;
import ParkingLotLLD.Manager.ParkingSpotManager;
import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;
import ParkingLotLLD.Vehicles.Vehicle;

import java.util.ArrayList;

public class ExitGate {
    public ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public void removeVehicle(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle);
        parkingSpotManager.removeVehicle(vehicle);
    }
}
