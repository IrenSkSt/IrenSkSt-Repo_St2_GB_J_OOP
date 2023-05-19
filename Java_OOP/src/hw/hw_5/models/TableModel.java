package hw.hw_5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import hw.hw_5.presenters.Model;

public class TableModel implements Model {
    /** Перечень столов */
    private Collection<Table> tables;

    /**
     * Получить список всех столиков
     * 
     * @return список столиков
     */
    public Collection<Table> getListOfTable() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Операция резервирования столика
     * 
     * @param dateReservation - дата,время резерва
     * @param numTable        - номер столика
     * @param nameCustomer    - имя клиента
     * @return - номер (id) брони
     *         -1 = "бронирование не состоялось"
     */
    public int reservationTable(Date dateReservation, int numTable, String nameCustomer) {

        for (Table table : tables) {
            if (table.getNum() == numTable) {
                Reservation reservation = new Reservation(dateReservation, nameCustomer);
                table.getListReservations().add(reservation);
                return reservation.getId();
            }

        }
        return -1;
        // throw new RuntimeException("Невозможно забронировать столик. Попробуйте еще
        // раз.");
    }

    /**
     * Операция отмены брони столика
     * 
     * @param reservationID - номер(ID) брони
     * @return результат отмены: 1=успешно, -1=ошибка(не найден номер брони)
     */
    public int cancelReservation(int reservationID) {
        for (Table table : tables) {
            for (Reservation reservation : table.getListReservations()) {
                if (reservation.getId() == reservationID) {

                    table.getListReservations().remove(reservation);
                    return 1;
                }

            }

        }
        return -1;

    }

    /**
     * Операция изменения брони (по принципу удаления старой и создания новой брони)
     * 
     * @param reservationID      - номер текущей брони
     * @param newDateReservation - дата/время новой брони
     * @param newNumTable        - номер столика в новой брони
     * @param newNameCustomer    - имя клиента в новой брони
     * @return - результат изменения брони:
     *         1 =если новая бронь успешно зарегистрирована, тогда старая отменяется
     *         (две операции должны быть успешные, иначе новвая удаляется)
     *         -1 = ошибка
     */
    public int changeReservationTable(int reservationID, Date newDateReservation, int newNumTable,
            String newNameCustomer) {
        for (Table table : tables) {
            for (Reservation reservation : table.getListReservations()) {
                if (reservation.getId() == reservationID) {
                    int newReservationID = reservationTable(newDateReservation, newNumTable, newNameCustomer);
                    if (newReservationID > 0) {
                        int resultCancelOldReservation = cancelReservation(reservationID);
                        if (resultCancelOldReservation > 0)
                            return newReservationID;
                    } else
                        cancelReservation(newReservationID);

                }

            }

        }
        return -1;

    }

}
