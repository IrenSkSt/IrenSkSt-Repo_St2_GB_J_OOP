package hw.hw_4;

public class Apple extends Fruit {

    private String name;

    static int counter;
    static float totalWeight;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public Apple() {
        super(0.135f);
        this.name = "Яблоко";
        totalWeight = totalWeight + weight;
    }

    @Override
    public String toString() {

        return String.format("%s вес = %.2f кг", this.name, weight);
    }
}
