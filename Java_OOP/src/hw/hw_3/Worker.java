
package hw.hw_3;

/**
 * !!! Допущение в рамках задачи = (по умолчанию) работник отработал
 * ВСЕ рабочие дни в месяце = 22 рабочих дня по норме (8ч в день)
 * без реализации иных вариантов
 */
class Worker extends Employee {

    /**
     * Счетчик работников на FullTime
     */
    private static int count;

    {
        count++;
    }

    public Worker(String firstName, String surName, double salary) {
        super(firstName, surName, salary);
        this.contract = Contract.FullTime;

    }

    @Override
    protected double calculateMonthSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return String.format("%s %s \t\t (%s)\t ставка ЗП = %.2f тыс.руб/мес. \tСр.месячная ЗП =%.2f руб/мес.\n",
                surName, firstName, contract,
                salary, calculateMonthSalary());
    }

}
