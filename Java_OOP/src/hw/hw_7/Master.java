package hw.hw_7;

public class Master implements Obsever {

    private String name;

    /** Минимальный уровень ЗП, за которую готов начать работать */
    private double minSalary;

    public Master(String name) {
        this.name = name;
        this.minSalary = 100;
    }

    @Override
    public String toString() {

        return String.format("Master %s претендует на ЗП не менее %d тыс.руб. \n", name, minSalary);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.minSalary < salary) {
            System.out.printf("Master %s >>> Мне нужна эта работа! [%s - %.0f тыс.руб.]\n", name, nameCompany, salary);
            this.minSalary = salary;
        } else {
            System.out.printf("Master %s >>> Есть более выгодное предложение [%s - %.0f тыс.руб.]\n", name, nameCompany,
                    salary);
        }
    }

}
