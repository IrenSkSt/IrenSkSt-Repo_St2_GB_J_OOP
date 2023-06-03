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

}
