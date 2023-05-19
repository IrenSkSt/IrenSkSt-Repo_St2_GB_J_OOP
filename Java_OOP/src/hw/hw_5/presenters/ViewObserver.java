package hw.hw_5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date dateReservation, int numTable, String nameCustomer);

    void onCancelReservation(int reservationID);
}
