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

        // клиент нажал на кнопку зарезервировать и заполнил форму резервирования
        System.out.println("\nСписок операции бронирования: ");
        String nameCustomer;

        System.out.printf("%s, ", nameCustomer = "Коля");
        view.reservationTable(new Date(), 2, nameCustomer);

        System.out.println("\nNext-------------------");
        System.out.printf("%s, ", nameCustomer = "Оля");
        view.reservationTable(new Date(), 7, nameCustomer);

        System.out.println("\nNext-------------------");
        System.out.printf("%s, ", nameCustomer = "Оля");
        view.reservationTable(new Date(), 4, nameCustomer);

        System.out.println("\nNext-------------------");
        System.out.printf("%s, ", nameCustomer = "Данил");
        view.reservationTable(new Date(), 5, nameCustomer);

        // клиент нажал кнопку отменить бронь
        int numReservation;
        System.out.println("\nNext-------------------");
        System.out.printf("Номер брони %d, ", numReservation = 1002);
        view.cancelReservation(numReservation);

        System.out.println("\nNext-------------------");
        System.out.printf("Номер брони %d  ", numReservation = 4002);
        view.cancelReservation(numReservation);

    }

}