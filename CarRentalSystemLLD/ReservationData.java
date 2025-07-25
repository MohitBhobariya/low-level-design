package CarRentalSystemLLD;

import CarRentalSystemLLD.Vehicles.Vehicle;

public class ReservationData {
    private Vehicle vehicle;
    private long bookingTime;
    private long bookedTill;
    private User user;
    private ReservationType reservationType;
    private ReservationStatus reservationStatus;

    public ReservationData(Vehicle vehicle, User user) {
        this.vehicle = vehicle;
        this.user = user;
        this.reservationType = ReservationType.HOURLY;
        this.reservationStatus = ReservationStatus.SCHEDULED;
    }
}
