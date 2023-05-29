package hw.hw_5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private int num;

    /** счетчик экземпляров столов */
    private static int counter;

    {
        ++counter;
    }
    /** Список бронирований стола */
    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getListReservations() {
        return reservations;
    }

    public Table() {
        this.num = counter;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {

        return String.format("Столик № %d", num);
    }

}
