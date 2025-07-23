package ParkingLotLLD.Ticket;

import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.Vehicles.Vehicle;

public class Ticket {
    public Long entranceTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;

    public Ticket(Long entranceTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entranceTime = entranceTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
