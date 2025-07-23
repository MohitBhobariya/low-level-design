package ParkingLotLLD.Manager;

import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;
import ParkingLotLLD.Vehicles.Vehicle;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots,ParkingStrategy parkingStrategy) {
        super(parkingSpots,parkingStrategy);
    }
}
