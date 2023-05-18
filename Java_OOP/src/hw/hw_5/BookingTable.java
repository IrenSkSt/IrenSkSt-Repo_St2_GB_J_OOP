package hw.hw_5;

import java.util.Date;

import hw.hw_5.models.TableModel;
import hw.hw_5.presenters.BookingPresenter;
import hw.hw_5.views.BookingView;

public class BookingTable {

    public static void startToBookTable() {

        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadListOfTables(); // загрузка данных
        bookingPresenter.updateView(); // отображение данных

        // клиент заполнил форму резервирования
        System.out.println("\nСписок операции бронирования: ");
        view.reservationTable(new Date(), 2, "Коля");
        System.out.println("Next-------------------");
        view.reservationTable(new Date(), 7, "Оля");
        System.out.println("Next-------------------");
        view.reservationTable(new Date(), 4, "Оля");
        System.out.println("Next-------------------");
        view.reservationTable(new Date(), 5, "Данил");
    }

}