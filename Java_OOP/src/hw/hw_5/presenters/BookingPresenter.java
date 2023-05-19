package hw.hw_5.presenters;

import java.util.Collection;
import java.util.Date;

import hw.hw_5.models.Table;

public class BookingPresenter implements ViewObserver {

    private Collection<Table> tables;

    private final Model model;
    private final View view;

    /** загрузить список столиков для бронирования */
    public void loadListOfTables() {
        tables = model.getListOfTable();
    }

    /** показать список столиков для бронирования */
    public void updateView() {
        view.showListOfTable(tables);
    }

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    public void updateStatusReservation(int reservationID) {
        view.showResultOfReservationTable(reservationID);
    }

    @Override
    public void onReservationTable(Date dateReservation, int numTable, String nameCustomer) {
        int reservationID = model.reservationTable(dateReservation, numTable, nameCustomer);
        updateStatusReservation(reservationID);
        //
    }

    public void resultCancelReservation(int resultCancel) {
        view.showResultCancelReservation(resultCancel);
    }

    @Override
    public void onCancelReservation(int reservationID) {
        int resultCancel = model.cancelReservation(reservationID);
        resultCancelReservation(resultCancel);
    }

}
