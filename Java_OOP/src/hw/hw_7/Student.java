package hw.hw_7;

public class Student implements Obsever {

    private String name;

    /** Минимальный уровень ЗП, за которую готов начать работать */
    private double minSalary;

    public Student(String name) {
        this.name = name;
        this.minSalary = 20;
    }

    @Override
    public String toString() {

        return String.format("Student %s претендует на ЗП не менее %d тыс.руб. \n", name, minSalary);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.minSalary < salary) {
            System.out.printf("Student %s >>> Мне нужна эта работа! [%s - %.0f тыс.руб.]\n", name, nameCompany, salary);
            this.minSalary = salary;
        } else {
            System.out.printf("Student %s >>> Есть более выгодное предложение [%s - %.0f тыс.руб.]\n", name,
                    nameCompany,
                    salary);
        }
    }

}
