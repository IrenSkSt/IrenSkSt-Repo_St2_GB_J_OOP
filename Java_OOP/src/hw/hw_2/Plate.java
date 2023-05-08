package hw.hw_2;

public class Plate implements ControlFood {

    private int food;
    private int additive = 0;

    public int getAdditive() {
        return additive;
    }

    public void setAdditive(int additive) {
        this.additive = +additive;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }

    public Plate() {
        this.food = 20;
    }

    public Plate(int food) {
        if (food < 0)
            throw new RuntimeException("Отрицательное значение еды!");
        else
            this.food = food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}
