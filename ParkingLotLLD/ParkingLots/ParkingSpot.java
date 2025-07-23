package ParkingLotLLD.ParkingLots;

import ParkingLotLLD.Vehicles.Vehicle;

public abstract class ParkingSpot {
    public Integer id;
    public Boolean isEmpty;
    public Vehicle vehicle;
    public Integer price;

    public ParkingSpot(Integer id, Integer price) {
        this.id = id;
        isEmpty = true;
        vehicle = null;
        this.price = price;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", isEmpty=" + isEmpty +
                ", vehicle=" + vehicle +
                ", price=" + price +
                '}';
    }
}
