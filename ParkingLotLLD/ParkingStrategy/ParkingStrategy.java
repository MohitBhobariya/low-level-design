package ParkingLotLLD.ParkingStrategy;

import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingLots.TwoWheelerParkingSpot;

public class ParkingStrategy {
    public ParkingSpot findParkingSpot(){
        return new TwoWheelerParkingSpot(1,5);
    }
}
