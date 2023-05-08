package hw.hw_2;

public class Plate implements ControlFood {

    private int food;
    private int maxFood = 50;
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
        if (food < 0)
            throw new RuntimeException("Отрицательное значение еды!");
        if (food > maxFood) {
            this.food = maxFood;
            System.out.printf("Миска вмещает только %d единиц еды, остальное не доступно питомцу.", maxFood);

        } else
            this.food = food;
    }

    public Plate() {
        this.food = 20;
        count++;
    }

    public Plate(int food) {
        if (food < 0)
            throw new RuntimeException("Отрицательное значение еды!");
        if (food > maxFood) {
            this.food = maxFood;
            System.out.printf("Миска вмещает только %d единиц еды, остальное не доступно питомцу.", maxFood);
            count++;
        } else {
            this.food = food;
            count++;
        }
    }

    public void addFood(int food) {
        if (food < 0)
            throw new RuntimeException("Отрицательное значение еды!");
        if (food > maxFood) {
            this.food = maxFood;
            System.out.printf("Миска вмещает только %d единиц еды, остальное не доступно питомцу.", maxFood);

        } else {
            System.out.printf("Вы добавили в миску %d единиц еды \n", food);
            this.food = this.getFood() + food;
        }
    }

    public void info() {
        System.out.printf("Тарелка %d: %d единиц еды \n", count, food);
    }
}
