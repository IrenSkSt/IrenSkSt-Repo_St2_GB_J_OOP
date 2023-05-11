package hw.hw_2;

/**
 * Plate - шаблон миски для приема пищи котом
 * 
 * @parame food - количество еды в миске
 * @parame maxFood - ограничение количества еды по объему, вмещающемуся в миску
 *         (вместимость миски)
 * @parame count - счетчик создаваемых мисок (1 место кормления)
 */
public class Plate implements ControlFood {

    private int food;
    private int maxFood = 50;
    public static Integer count;

    static {
        count = 1;
    }

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

    /**
     * addFood предназначен для добавление еды пользователем
     * 
     * @param food - колво добавки еды в миску, но не более вместимости миски
     */
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
