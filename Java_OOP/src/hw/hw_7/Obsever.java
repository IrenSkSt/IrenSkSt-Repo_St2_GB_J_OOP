package hw.hw_7;

public interface Obsever {

    PROFESSION getProfession();

    void receiveOffer(String nameCompany, PROFESSION profession, POSITION position, double salary);
}
