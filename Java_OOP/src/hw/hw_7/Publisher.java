package hw.hw_7;

public interface Publisher {

    void registerObserver(Obsever obsever);

    void removeObserver(Obsever obsever);

    void sendOffer(String nameCompany, PROFESSION profession, POSITION position, double salary);
}
