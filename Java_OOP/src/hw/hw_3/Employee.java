package hw.hw_3;

abstract class Employee {

    /**
     * Имя работника
     */
    protected String firstName;
    /**
     * ФАмилия работника
     */
    protected String surName;
    /**
     * Тип контракта: имеет 2 значения: FullTime, Freelance
     */
    protected Contract contract;

    /**
     * ставка (зарплата) за месяц
     */
    protected double salary;
    private static int count;
    {
        count++;
    }

    /**
     * Конструктуор - шаблон карточки работника
     * 
     * @param firstName = Имя
     * @param surName   = Фамилия
     * @param salary    = ставка ЗП за месяц
     */
    public Employee(String firstName, String surName, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {

        return String.format("Работник %d: %s %s ставка ЗП = %.2f руб/мес.\n", count, surName, firstName, salary);
    }

}
