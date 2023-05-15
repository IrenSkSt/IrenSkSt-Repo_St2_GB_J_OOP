package hw.hw_4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private String name;

    private ArrayList<T> box;

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

    public Box(ArrayList<T> box) {
        this.box = box;
        this.name = String.format("Box #%d", counter);
    }

}
