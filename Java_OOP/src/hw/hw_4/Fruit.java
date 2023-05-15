package hw.hw_4;

public abstract class Fruit {

    protected final float weight;

    static int counter;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
