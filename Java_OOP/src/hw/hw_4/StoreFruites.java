package hw.hw_4;

public class StoreFruites {

    public static void createBoxesWithFruites() {
        // Fruit fruit1 = new Apple(); // для проверки
        // System.out.println(fruit1); // для проверки

        // Fruit fruit2 = new Orange(); // для проверки
        // System.out.println(fruit2); // для проверки

        // Box<Apple> box1 = new Box<>(); // для проверки
        // box1.addFruitToBox(new Apple()); // для проверки
        // box1.addFruitToBox(new Apple()); // для проверки
        // // box1.addFruitToBox(new Orange()); // для проверки
        // box1.getInfo(); // для проверки

        Box<Orange> box2 = new Box<>("Orange"); // для проверки
        // box2.addFruitToBox(new Apple()); // для проверки
        box2.addFruitToBox(new Orange()); // для проверки
        box2.addFruitToBox(new Orange()); // для проверки
        box2.getInfo(); // для проверки
        System.out.println(box2.getTotalWeight()); // для проверки

        /** Получены фрукты для сортировки */
        // ListOfFruites.createListOfFruites();

        /** Получили коробки */
        // ListOfBoxes.getBoxs();

        /**
         * Фрукты будут автоматически разложены по своим коробкам по очередно в каждую
         */
        // ListOfBoxes.putFruitsToBoxs();
    }

}
