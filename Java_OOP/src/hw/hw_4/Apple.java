package hw.hw_4;

public class Apple extends Fruit {

    private String name;
    /** количество яблок всего */
    static int counter;
    /** общий вес яблок */
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
        /** вес яблока- 1шт. */
        super(0.135f);
        this.name = "Яблоко";
        totalWeight = totalWeight + weight;
    }

    @Override
    public String toString() {

        return String.format("%s вес = %.2f кг", this.name, weight);
    }
}
