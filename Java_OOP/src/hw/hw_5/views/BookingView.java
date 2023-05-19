package hw.hw_5.views;

import java.util.Collection;
import java.util.Date;

import hw.hw_5.models.Table;
import hw.hw_5.presenters.View;
import hw.hw_5.presenters.ViewObserver;

public class BookingView implements View {

    /**
     * Наблюдатель для отслеживания действий пользователя
     */
    private ViewObserver observer;

    /**
     * Установить наблюдателя для отслеживания действий пользователя
     * 
     * @param observer
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /** Показать список всех столиков */
    public void showListOfTable(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    /**
     * Отображение результата резервирования для пользователя
     * 
     * @param reservationID - номер брони (успешно прошла операция бронирования)
     *                      либо сообщение о невозможности бронирования (какой-то
     *                      сбой в бронировании)
     */
    public void showResultOfReservationTable(int reservationID) {
        if (reservationID > 0)
            System.out.printf("\nСтолик зарезервирован - номер брони: %d \n", reservationID);
        else
            System.out.println("\nОшибка бронирвания. Повторите попытку.\n");
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
        observer.onReservationTable(dateReservation, numTable, nameCustomer);
    }

    /**
     * Отображение результата отмены резервирования для пользователя
     * 
     * @param resultCancel - сообщение о результате отмены брони: успешно или нет
     */
    public void showResultCancelReservation(int resultCancel) {
        if (resultCancel > 0) {
            System.out.println(resultCancel); // для проверки
            System.out.println("\nБронь успешно отменена.\n");
        } else
            System.out.println("\nОшибка. Отмена брони не выполнена. Повторите попытку.\n");
    }

    /**
     * Событие - Пользователь нажал на кнопку отмены бронирования по номеру брони
     * 
     * @param reservationID - номер (ID) брони
     */
    public void cancelReservation(int reservationID) {
        observer.onCancelReservation(reservationID);
    }
}
