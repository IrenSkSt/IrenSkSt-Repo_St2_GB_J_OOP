
package hw.hw_3;

/**
 * !!! Допущение в рамках задачи = (по умолчанию) работник отработал
 * ВСЕ рабочие дни в месяце = 20 рабочих дней
 * без реализации иных вариантов
 */
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
     * год рождения работника
     */
    protected int yearBorn;
    /**
     * Тип контракта: имеет 2 значения: FullTime, Freelance
     */
    protected Contract contract;

    /**
     * ставка (зарплата) за месяц
     */
    protected double salary;

    /**
     * Счетчик работников
     */
    private static int count;

    {
        count++;
    }

    public static int getCount() {
        return count;
    }

    /**
     * Конструктуор - шаблон карточки работника
     * 
     * @param firstName = Имя
     * @param surName   = Фамилия
     * @param salary    = ставка ЗП за месяц
     */
    public Employee(String firstName, String surName, int yearBorn, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.yearBorn = yearBorn;
        this.salary = salary;

    }

    /**
     * Расчет среднемесячной ЗП
     */
    protected abstract double calculateMonthSalary();

    @Override
    public String toString() {

        return String.format("%d: %s %s (%d г.р.)\tставка ЗП = %.2f тыс.руб/мес.\n", count, surName, firstName,
                yearBorn, salary);
    }

}
