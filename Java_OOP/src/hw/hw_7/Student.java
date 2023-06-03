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

}
