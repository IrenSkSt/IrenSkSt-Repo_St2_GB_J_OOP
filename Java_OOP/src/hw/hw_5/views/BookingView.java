package hw.hw_5.views;

import java.util.Collection;
import java.util.Date;

import hw.hw_5.models.Table;
import hw.hw_5.presenters.View;

public class BookingView implements View {

    /** Показать список всех столиков */
    public void showListOfTable(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    /**
     * Событие - Пользователь нажал на кнопку бронировать и заполняет форму
     * резервирования столика
     * 
     * @param dateReservation - дата резервирования
     * @param numTable        - номер столика
     * @param nameCustomer    - имя клиента
     */
    public void reservationTable(Date dateReservation, int numTable, String nameCustomer) {

    }

}
