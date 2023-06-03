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

    public void needEmployee() {
        Random random = new Random();
        double salary = random.nextDouble(15, maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }

}
