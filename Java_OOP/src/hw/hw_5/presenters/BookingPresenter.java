package hw.hw_5.presenters;

import java.util.Collection;

import hw.hw_5.models.Table;

public class BookingPresenter implements ViewObserver {

    private Collection<Table> tables;

    private final Model model;
    private final View view;

    /** загрузить список столиков для бронирования */
    public void loadListOfTables() {
        tables = model.getListOfTable();
    }

    /** показать список столиков для бронирования */
    public void updateView() {
        view.showListOfTable(tables);
    }

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

}
