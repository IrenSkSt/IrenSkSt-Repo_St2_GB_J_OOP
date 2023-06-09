package hw.hw_5.presenters;

import java.util.Collection;
import java.util.Date;

import hw.hw_5.models.Table;

public interface Model {

    /** Получить список всех столиков */
    Collection<Table> getListOfTable();

    /** Операция резервирования столика */
    int reservationTable(Date dateReservation, int numTable, String nameCustomer);

    /** Операция отмены брони столика */
    int cancelReservation(int reservationID);

    /**
     * Операция изменения брони (по принципу удаления старой и создания новой брони)
     */
    int changeReservationTable(int reservationID, Date newDateReservation, int newNumTable,
            String newNameCustomer);
}
