package hw.hw_5;

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
    }

}