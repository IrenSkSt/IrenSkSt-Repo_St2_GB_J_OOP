package hw.hw_7;

public class Vacancy {

    private String nameCompany;
    private PROFESSION profession;
    private POSITION position;
    private double salary;

    public String getNameCompany() {
        return nameCompany;
    }

    public PROFESSION getProfession() {
        return profession;
    }

    public POSITION getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Vacancy(String nameCompany, PROFESSION profession, POSITION position, double salary) {
        this.nameCompany = nameCompany;
        this.profession = profession;
        this.position = position;
        this.salary = salary;

    }

}
