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
     * каждому соискателю, соответствующему вакансии по позиции и профессии
     */
    @Override
    public void sendOffer(String nameCompany, PROFESSION profession, POSITION position, double salary) {
        for (Obsever obsever : observers) {
            if (obsever instanceof Student && position.equals(POSITION.Entern)
                    || obsever instanceof Junior && position.equals(POSITION.Junior)
                    || obsever instanceof Master && position.equals(POSITION.Master))
                if (profession.equals(obsever.getProfession()))

                    obsever.receiveOffer(nameCompany, profession, position, salary);
        }
    }

}
