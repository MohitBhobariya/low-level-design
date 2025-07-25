package CarRentalSystemLLD.Vehicles;

import CarRentalSystemLLD.Enum.Status;
import CarRentalSystemLLD.Enum.VehicleType;


public abstract class Vehicle {
    private int id;
    private String company;
    private String model;
    private int vehicleNumber;
    private int noOfSeats;
    private int hourlyCharge;
    private int dailyCharge;
    private Status status;
    private VehicleType vehicleType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getHourlyCharge() {
        return hourlyCharge;
    }

    public void setHourlyCharge(int hourlyCharge) {
        this.hourlyCharge = hourlyCharge;
    }

    public int getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(int dailyCharge) {
        this.dailyCharge = dailyCharge;
    }
}
