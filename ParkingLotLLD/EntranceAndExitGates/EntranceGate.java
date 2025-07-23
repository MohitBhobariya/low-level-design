package ParkingLotLLD.EntranceAndExitGates;

import ParkingLotLLD.Factory.ParkingSpotManagerFactory;
import ParkingLotLLD.Manager.ParkingSpotManager;
import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;
import ParkingLotLLD.Ticket.Ticket;
import ParkingLotLLD.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class EntranceGate {
    public ParkingSpotManagerFactory parkingSpotManagerFactory;
    public Ticket ticket;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        return parkingSpotManagerFactory.getParkingSpotManager(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(System.currentTimeMillis(), vehicle, parkingSpot);
    }
}
