package hw.hw_4;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {

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
        if (fruites.size() == 0)
            return totalWeight = 0;
        else
            return totalWeight = fruites.size() * fruites.get(0).weight;
    }

    public Box(String typeBox) {
        this.fruites = new ArrayList<T>();
        this.name = String.format("Box #%d", counter);
        this.typeBox = typeBox;
        this.totalWeight = getTotalWeight();
    }

    public void addFruitToBox(T fruit) {
        this.fruites.add(fruit);
        this.totalWeight = getTotalWeight();
    }

    public void deleteFruitFromBox(T fruit) {
        this.fruites.remove(fruit);
        this.totalWeight = getTotalWeight();
    }

    public void replaceFruitFromBox(T fruit, Box<T> newBox) {
        newBox.fruites.add(fruit);
        this.fruites.remove(fruit);
        this.totalWeight = getTotalWeight();
        newBox.totalWeight = newBox.getTotalWeight();
    }

    public void replaceAllFruitsFromBox(Box<T> newBox) {
        for (T t : this.fruites) {
            newBox.fruites.add(t);
            remove(t);
        }
        this.totalWeight = getTotalWeight();
        newBox.totalWeight = newBox.getTotalWeight();
    }

    private void remove(T t) {
    }

    public T getElement(Integer index) {
        return fruites.get(index);
    }

    public void getInfo() {
        System.out.printf("\n%s (%.2f кг): ", name, getTotalWeight());

        for (T fruit : fruites) {
            System.out.printf("%s  ", fruit.getName());
        }
        System.out.println();
        // return String.format("%s (%s)", name, typeBox);

    }

    public String compare(Box<?> o) {

        return String.format(
                (compareTo(o) == 0) ? "\nКоробки %s и %s одинакового веса" : "\nВес коробок %s и %s разный\n",
                this.getName(), o.getName());
    }

    @Override
    public int compareTo(Box<?> o) {
        // System.out.println(this.totalWeight); // для проверки
        // System.out.println(o.getTotalWeight()); // для проверки
        // return Float.compare(this.totalWeight, o.totalWeight);
        return Float.compare(getTotalWeight(), o.getTotalWeight());
    }

    // -------не работает------не сделан
    // public int compare(Box o1, Box o2) {
    // System.out.println(o1.totalWeight);
    // System.out.println(o2.getTotalWeight());
    // // return Float.compare(this.totalWeight, o.totalWeight);
    // return Float.compare(o1.getTotalWeight(), o2.getTotalWeight());
    // }

}
