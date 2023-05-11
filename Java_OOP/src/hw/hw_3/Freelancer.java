package hw.hw_3;

class Freelancer extends Employee {

    private static int count;

    {
        count++;
    }

    public Freelancer(String firstName, String surName, double salary) {
        super(firstName, surName, salary);
        this.contract = Contract.Freelance;

    }

    @Override
    public String toString() {

        return String.format("Работник: %s %s   \t (%s) ставка ЗП = %.2f руб/час.\n", surName, firstName, contract,
                salary);
    }

}
