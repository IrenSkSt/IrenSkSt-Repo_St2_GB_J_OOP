package hw.hw_4;

import java.util.Random;

public class ListOfBoxes {

    static Box[] lBoxs = new Box[4];

    public static void getBoxs() {

        System.out.println("Получены коробки: ");

        Random rr = new Random();

        int num = rr.nextInt(1, 4);

        for (int i = 0; i < lBoxs.length; i++) {
            if (i < num)
                lBoxs[i] = new Box<Apple>("Apple");
            else
                lBoxs[i] = new Box<Orange>("Orange");
        }
        for (Box box : lBoxs) {
            System.out.printf("%s (%s) \t", box.getName(), box.getTypeBox());
        }
        System.out.println();
    }

    public static void putFruitsToBoxs() {
        for (Box box : lBoxs) {
        }
    }

}
