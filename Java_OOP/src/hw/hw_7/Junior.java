package hw.hw_7;

public class Junior implements Obsever {

    private String name;

    /** Минимальный уровень ЗП, за которую готов начать работать */
    private double minSalary;

    public Junior(String name) {
        this.name = name;
        this.minSalary = 60;
    }

    @Override
    public String toString() {

        return String.format("Junior %s претендует на ЗП не менее %d тыс.руб. \n", name, minSalary);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.minSalary < salary) {
            System.out.printf("Junior %s >>> Мне нужна эта работа! [%s - %.0f тыс.руб.]\n", name, nameCompany, salary);
            this.minSalary = salary;
        } else {
            System.out.printf("Junior %s >>> Есть более выгодное предложение [%s - %.0f тыс.руб.]\n", name, nameCompany,
                    salary);
        }
    }

}
