package hw.hw_5.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;

    {
        id = ++counter;
    }

    private Date date;

    private String nameCustomer;

    public Reservation(Date date, String nameCustomer) {
        this.date = date;
        this.nameCustomer = nameCustomer;

    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    @Override
    public String toString() {

        return String.format("Бронь %d: %s", id, nameCustomer);
    }
}
