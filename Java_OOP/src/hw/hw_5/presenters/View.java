package hw.hw_5.presenters;

import java.util.Collection;

import hw.hw_5.models.Table;

public interface View {

    /** Показать список всех столиков */
    void showListOfTable(Collection<Table> tables);

}
