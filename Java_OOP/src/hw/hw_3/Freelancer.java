package hw.hw_3;

/**
 * !!! Допущение в рамках задачи = (по умолчанию) работник отработал
 * ВСЕ рабочие дни в месяце = 22 рабочих дня по норме времени (4ч в день)
 * без реализации иных вариантов
 */
class Freelancer extends Employee {
    /**
     * Норма времени отработки в день = (по умолчанию) 4ч
     */
    private int normTime;
    /**
     * Количество рабочих дней в месяце: по умолчанию отработано = 22 раб.дн за
     * месяц
     */
    private int workDays;
    /**
     * Счетчик работников на Freelance
     */
    private static int count;

    {
        count++;
    }

    public Freelancer(String firstName, String surName, double salary) {
        super(firstName, surName, salary);
        this.contract = Contract.Freelance;
        this.normTime = 4; // по умолчанию установлено =4ч
        this.workDays = 22; // по умолчанию установлено =22 раб.дня в месяце

    }

    @Override
    protected double calculateMonthSalary() {
        return salary * normTime * workDays;
    }

    @Override
    public String toString() {

        return String.format("%s %s \t (%s)\t ставка ЗП = %.2f руб/мес.\tСр.месячная ЗП = %.2f руб/мес.\n",
                surName, firstName, contract,
                salary, calculateMonthSalary());
    }

}
