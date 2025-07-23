package ParkingLotLLD.Factory;

import ParkingLotLLD.Manager.FourWheelerParkingSpotManager;
import ParkingLotLLD.Manager.ParkingSpotManager;
import ParkingLotLLD.Manager.TwoWheelerParkingSpotManager;
import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingLots.TwoWheelerParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;
import ParkingLotLLD.Vehicles.Vehicle;
import ParkingLotLLD.Vehicles.VehicleType;

import java.util.List;

public class ParkingSpotManagerFactory {
    private final TwoWheelerParkingSpotManager twoWheelerParkingSpotManager;
    private final FourWheelerParkingSpotManager fourWheelerParkingSpotManager;

    public ParkingSpotManagerFactory(TwoWheelerParkingSpotManager twoWheelerParkingSpotManager, FourWheelerParkingSpotManager fourWheelerParkingSpotManager) {
        this.twoWheelerParkingSpotManager = twoWheelerParkingSpotManager;
        this.fourWheelerParkingSpotManager = fourWheelerParkingSpotManager;
    }

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        if (vehicle.vehicleType == VehicleType.TwoWheeler) {
            return twoWheelerParkingSpotManager;
        } else if (vehicle.vehicleType == VehicleType.FourWheeler) {
            return fourWheelerParkingSpotManager;
        } else {
            return null;
        }
    }
}
