package hw.hw_7;

import java.util.Random;

/**
 * Компания -работодатель
 */
public class Company {
    private String nameCompany;
    private double maxSalary;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    // public void needEmployee() {
    // Random random = new Random();
    // double salary = random.nextDouble(15, maxSalary);
    // jobAgency.sendOffer(nameCompany, salary);
    // }

    public void createVacancy(PROFESSION profession, POSITION position) {
        Random random = new Random();
        double salary;
        switch (position) {
            case Entern:
                salary = random.nextDouble(15, maxSalary / 3);
                break;
            case Junior:
                salary = random.nextDouble(maxSalary / 3, maxSalary * 2 / 3);
                break;
            default:
                salary = random.nextDouble(maxSalary * 2 / 3, maxSalary);
                break;
        }
        new Vacancy(nameCompany, profession, position, salary);
        jobAgency.sendOffer(nameCompany, profession, position, salary);

    }

}
