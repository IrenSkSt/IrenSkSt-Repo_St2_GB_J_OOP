package hw.hw_4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private String name;
    private String typeBox;

    private ArrayList<T> fruites;

    private float totalWeight;

    private static int counter;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String getTypeBox() {
        return typeBox;
    }

    public float getTotalWeight() {
        return totalWeight = fruites.size() * fruites.get(0).weight;
    }

    public Box(String typeBox) {
        this.fruites = new ArrayList<T>();
        this.name = String.format("Box #%d", counter);
        this.typeBox = typeBox;
    }

    public void addFruitToBox(T fruit) {
        this.fruites.add(fruit);
    }

    public void getInfo() {
        System.out.printf("\n%s : ", name);

        for (T fruit : fruites) {
            System.out.printf("%s  ", fruit.getName());
        }
        System.out.println();
        // return String.format("%s (%s)", name, typeBox);

    }
}
