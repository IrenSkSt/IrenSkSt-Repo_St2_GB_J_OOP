package hw.hw_2;

public class Plate {

    private int food;

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
        if(food<0) throw new RuntimeException("Отрицательное значение еды!");
        else this.food = food;
    }

    public void info () {
        System.out.println("Plate: " + food);
    }
}
