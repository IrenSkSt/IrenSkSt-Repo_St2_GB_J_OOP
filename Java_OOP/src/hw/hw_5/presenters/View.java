package hw.hw_5.presenters;

import java.util.Collection;

import hw.hw_5.models.Table;

public interface View {

    /** Показать список всех столиков */
    void showListOfTable(Collection<Table> tables);

    /** Установить наблюдателя для отслеживания действий пользователя */
    void setObserver(ViewObserver observer);

    /** Отображение результата резервирования для пользователя */
    void showResultOfReservationTable(int reservationID);

    /** Отображение результата отмены резервирования для пользователя */
    void showResultCancelReservation(int resultCancel);

    /** Отображение результата изменения резервирования для пользователя */
    void showResultChangeReservationTable(int newReservationID);
}
