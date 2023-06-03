package hw.hw_7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Obsever> observers = new ArrayList<>();

    @Override
    public void registerObserver(Obsever obsever) {
        observers.add(obsever);

    }

    @Override
    public void removeObserver(Obsever obsever) {
        observers.remove(obsever);

    }

    /**
     * Рассылка агентством полученной вакансии от компании
     * каждому соискателю
     */
    @Override
    public void sendOffer(String nameCompany, double salary) {
        for (Obsever obsever : observers) {
            obsever.receiveOffer(nameCompany, salary);
        }
    }

}
