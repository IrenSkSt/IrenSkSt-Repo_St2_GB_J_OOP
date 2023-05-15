package hw.hw_4;

public abstract class Fruit {

    protected final float weight;

    static int counter;
    static float totalWeight;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static float getTotalWeight() {
        return totalWeight;
    }

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
        totalWeight = totalWeight + weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
