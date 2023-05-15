package hw.hw_4;

public class Orange extends Fruit {

    private String name;

    static int counter;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public Orange() {
        super(0.203f);
        this.name = "Апельсин";
    }

    @Override
    public String toString() {

        return String.format("%s вес = %.2f кг", this.name, weight);
    }
}
