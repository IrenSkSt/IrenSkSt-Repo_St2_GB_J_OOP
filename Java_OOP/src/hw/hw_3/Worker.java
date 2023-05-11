package hw.hw_3;

class Worker extends Employee {

    private static int count;

    {
        count++;
    }

    public Worker(String firstName, String surName, double salary) {
        super(firstName, surName, salary);
        this.contract = Contract.FullTime;

    }

    @Override
    public String toString() {

        return String.format("Работник: %s %s   \t (%s) ставка ЗП = %.2f руб/мес.\n", surName, firstName, contract,
                salary);
    }

}
