package hw.hw_4;

public class Orange extends Fruit {

    private String name;
    /** количество апельсинов всего */
    static int counter;
    /** общий вес апельсинов */
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

    public Orange() {
        /** вес апельсина- 1шт. */
        super(0.203f);
        this.name = "Апельсин";
        totalWeight = totalWeight + weight;
    }

    @Override
    public String toString() {

        return String.format("%s вес = %.2f кг", this.name, weight);
    }
}
