package ParkingLotLLD.Manager;


import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
     super(parkingSpots,parkingStrategy);
    }
}
