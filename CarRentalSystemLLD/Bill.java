package CarRentalSystemLLD;

public class Bill {

    ReservationData reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(ReservationData reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount() {

        return 100.0;
    }

}
