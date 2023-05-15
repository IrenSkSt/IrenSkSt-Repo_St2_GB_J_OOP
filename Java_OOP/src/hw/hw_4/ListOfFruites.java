package hw.hw_4;

import java.util.Random;

public class ListOfFruites {

    static Fruit[] lFruits = new Fruit[10];

    public static void createListOfFruites() {

        Random r = new Random();

        System.out.println("Поступили фрукты на сортировку: ");
        // float totalWeight = 0;
        for (int i = 0; i < lFruits.length; i++) {
            lFruits[i] = r.nextInt(2) != 0 ? new Apple() : new Orange();
            // totalWeight = totalWeight + lFruits[i].weight;
            System.out.println(lFruits[i]);
        }
        System.out.println("------------------------------------");
        System.out.printf("Всего: %d шт. (общий вес = %.2f кг), \n", Fruit.counter, Fruit.totalWeight);
        System.out.printf("в том числе яблоки (%d шт. - %.2f кг) и апельсины (%d шт. - %.2f кг)\n",
                Apple.counter, Apple.totalWeight, Orange.counter, Orange.totalWeight);
        System.out.println("------------------------------------");
    }

}
