package ParkingLotLLD;

import ParkingLotLLD.EntranceAndExitGates.EntranceGate;
import ParkingLotLLD.EntranceAndExitGates.ExitGate;
import ParkingLotLLD.Factory.ParkingSpotManagerFactory;
import ParkingLotLLD.Manager.FourWheelerParkingSpotManager;
import ParkingLotLLD.Manager.ParkingSpotManager;
import ParkingLotLLD.Manager.TwoWheelerParkingSpotManager;
import ParkingLotLLD.ParkingLots.FourWheelerParkingSpot;
import ParkingLotLLD.ParkingLots.ParkingSpot;
import ParkingLotLLD.ParkingLots.TwoWheelerParkingSpot;
import ParkingLotLLD.ParkingStrategy.ParkingStrategy;
import ParkingLotLLD.Vehicles.Vehicle;
import ParkingLotLLD.Vehicles.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> twoWheelerParkingSpot = new ArrayList<>();
        List<ParkingSpot> fourWheelerParkingSpot = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                twoWheelerParkingSpot.add(new TwoWheelerParkingSpot(i, 5));
            } else {
                fourWheelerParkingSpot.add(new FourWheelerParkingSpot(i, 10));
            }
        }
        TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(twoWheelerParkingSpot, new ParkingStrategy());
        FourWheelerParkingSpotManager fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(fourWheelerParkingSpot, new ParkingStrategy());
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory(twoWheelerParkingSpotManager, fourWheelerParkingSpotManager);
        EntranceGate entranceGate = new EntranceGate(parkingSpotManagerFactory);
        ExitGate exitGate = new ExitGate(parkingSpotManagerFactory);
        for (int i = 0; i < 5; i++) {
            ParkingSpot twoWheelerSpot = twoWheelerParkingSpot.get(i);
            Vehicle twoWheelervehicle = new Vehicle(i * 10, VehicleType.TwoWheeler);
            entranceGate.getParkingSpotManager(twoWheelervehicle).addVehicle(twoWheelerSpot, twoWheelervehicle);
            ParkingSpot fourWheelerSpot = fourWheelerParkingSpot.get(i);
            Vehicle fourWheelerVehicle = new Vehicle(i * 10, VehicleType.FourWheeler);
            entranceGate.getParkingSpotManager(fourWheelerVehicle).addVehicle(fourWheelerSpot, fourWheelerVehicle);
        }
        twoWheelerParkingSpotManager.printParkingSpots();
        fourWheelerParkingSpotManager.printParkingSpots();
        exitGate.removeVehicle(new Vehicle(20, VehicleType.TwoWheeler));
        twoWheelerParkingSpotManager.printParkingSpots();
    }
}
