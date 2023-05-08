package hw.hw_2;

public class Plate implements ControlFood {

    private int food;
    public static Integer count;

    static {
        count = 1;
    }

    // additive - для вариаций действий хозяина питомца =пока не реализовано
    // пока сделано автоматическое пополнение тарелки кормом, чтобы накормить
    // питомца
    // private int additive = 0;

    // public int getAdditive() {
    // return additive;
    // }

    // public void setAdditive(int additive) {
    // this.additive = +additive;
    // }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }

    public Plate() {
        this.food = 20;
        count++;
    }

    public Plate(int food) {
        if (food < 0)
            throw new RuntimeException("Отрицательное значение еды!");
        else {
            this.food = food;
            count++;
        }
    }

    public void info() {
        System.out.printf("Тарелка %d: %d единиц еды \n", count, food);
    }
}
