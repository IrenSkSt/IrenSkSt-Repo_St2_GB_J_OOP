package hw.hw_7;

public class Junior implements Obsever {

    private String name;
    private PROFESSION profession;

    /** Минимальный уровень ЗП, за которую готов начать работать */
    private double minSalary;

    public String getName() {
        return name;
    }

    public PROFESSION getProfession() {
        return profession;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public Junior(String name, PROFESSION profession) {
        this.name = name;
        this.profession = profession;
        this.minSalary = 60;
    }

    @Override
    public String toString() {

        return String.format("Junior %s %s претендует на ЗП не менее %.0f тыс.руб. \n", profession, name, minSalary);
    }

    @Override
    public void receiveOffer(String nameCompany, PROFESSION prof, POSITION position, double salary) {
        if (this.minSalary < salary) {
            System.out.printf("Junior %s %s >>> Мне нужна эта работа! [%s  %s %s - %.0f тыс.руб.]\n", profession, name,
                    nameCompany, prof, position, salary);
            this.minSalary = salary;
        } else {
            System.out.printf("Junior %s %s >>> Есть более выгодное предложение [%s  %s %s - %.0f тыс.руб.]\n",
                    profession, name, nameCompany, prof, position, salary);
        }
    }

}
