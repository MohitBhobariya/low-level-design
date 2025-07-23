package ParkingLotLLD.ParkingStrategy;

import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingLots.TwoWheelerParkingSpot;

public class NearEntranceParkingStrategy extends ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot() {
        return new TwoWheelerParkingSpot(1,10);
    }
}
