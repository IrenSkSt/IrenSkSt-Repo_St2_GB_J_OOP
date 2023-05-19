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
                if (reservation.getId() == reservationID)
                    table.getListReservations().remove(reservation);
                return 1;
            }

        }
        return -1;

    }

}
