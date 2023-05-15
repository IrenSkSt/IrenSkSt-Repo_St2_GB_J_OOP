package hw.hw_4;

import java.util.Random;

public class ListOfBoxes {

    static Box[] lBoxs = new Box[4];

    public static void getBoxs() {

        System.out.println("Получены коробки: ");

        Random rr = new Random();

        int num = rr.nextInt(1, 4);

    }

}
