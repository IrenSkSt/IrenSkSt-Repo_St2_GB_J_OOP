package hw.hw_4;

public class StoreFruites {

    public static void createBoxesWithFruites() {
        Apple fruit1 = new Apple(); // для проверки
        // System.out.println(fruit1); // для проверки

        Fruit fruit2 = new Orange(); // для проверки
        // System.out.println(fruit2); // для проверки

        Box<Apple> box1 = new Box<>("Apple"); // для проверки
        box1.addFruitToBox(new Apple()); // для проверки
        box1.addFruitToBox(new Apple()); // для проверки
        box1.addFruitToBox(new Apple()); // для проверки
        box1.addFruitToBox(new Apple()); // для проверки
        box1.addFruitToBox(fruit1); // для проверки
        // box1.addFruitToBox(new Orange()); // для проверки
        box1.getInfo(); // для проверки
        // System.out.println(box1.getTotalWeight()); // для проверки
        // System.out.println(box1.getElement(2)); // для проверки

        Box<Orange> box2 = new Box<>("Orange"); // для проверки
        // box2.addFruitToBox(new Apple()); // для проверки
        box2.addFruitToBox(new Orange()); // для проверки
        box2.addFruitToBox(new Orange()); // для проверки
        box2.addFruitToBox((Orange) fruit2); // для проверки
        box2.getInfo(); // для проверки
        // System.out.println(box2.getTotalWeight()); // для проверки

        Box<Apple> box3 = new Box<>("Apple"); // для проверки

        // System.out.println(box2.compareTo(box1)); // для проверки
        // System.out.println(compare(box2, box1)); // для проверки
        // System.out.println(box2.compare(box1)); // для проверки
        System.out.println(box2.compare(box1)); // для проверки

        // --------------------------------------------
        // Автоматическая конструкция - не реализована - не работате
        // /** Получены фрукты для сортировки */
        // ListOfFruites.createListOfFruites();

        // if (ListOfFruites.lFruits.length != 0) {
        // for (Apple fruit : ListOfFruites.lFruits) {

        // box1.addFruitToBox(fruit);

        // }
        // for (Orange fruit : ListOfFruites.lFruits) {
        // box2.addFruitToBox(fruit);
        // }

        // }

        // /** Получили коробки (тару) */
        // ListOfBoxes.getBoxs();

        // /**
        // * Фрукты будут автоматически разложены
        // * в ближайшую коробку(тару) предназначенную для этого типа фрукта
        // */
        // // ListOfBoxes.putFruitsToBoxs();
        // // putFruitsToBoxs();
    }

    // public static void putFruitsToBoxs() {

    // }
}
