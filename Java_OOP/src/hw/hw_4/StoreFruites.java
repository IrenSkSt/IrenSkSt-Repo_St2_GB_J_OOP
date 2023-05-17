package hw.hw_4;

public class StoreFruites {

    public static void createBoxesWithFruites() {

        // v1-------простые решения задачи
        Apple fruit1 = new Apple();
        System.out.println(fruit1);

        Fruit fruit2 = new Orange();
        System.out.println(fruit2);

        Box<Apple> box1 = new Box<>("Apple");
        box1.getInfo();
        System.out.println("\nРазложили фрукты по коробкам: ");
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(fruit1);
        // box1.addFruitToBox(new Orange()); // для проверки
        box1.getInfo();
        // System.out.println(box1.getTotalWeight()); // для проверки
        // System.out.println(box1.getElement(2)); // для проверки

        Box<Orange> box2 = new Box<>("Orange");
        // box2.addFruitToBox(new Apple()); // для проверки
        box2.addFruitToBox(new Orange());
        box2.addFruitToBox(new Orange());
        box2.addFruitToBox((Orange) fruit2);
        box2.getInfo();
        // System.out.println(box2.getTotalWeight()); // для проверки

        box1.deleteFruitFromBox(fruit1);
        System.out.printf("\nУдалили из коробки %s %s", box1.getName(), fruit1.getName());
        box1.getInfo();

        // System.out.println(box2.compareTo(box1)); // для проверки
        // System.out.println(compare(box2, box1)); // для проверки
        // System.out.println(box2.compare(box1)); // для проверки
        System.out.println(box2.compare(box1));

        Box<Apple> box3 = new Box<>("Apple");
        // box2.replaceFruitFromBox(box2.getElement(2), box3); // для проверки
        box1.replaceFruitFromBox(box1.getElement(2), box3);
        System.out.printf("\nПереложили из коробки %s в %s %s", box1.getName(), box3.getName(), fruit1.getName());
        box1.getInfo();
        box3.getInfo();

        // box2.replaceAllFruitsFromBox(box3); // для проверки
        box1.replaceAllFruitsFromBox(box3);
        System.out.printf("\nПереложили все фрукты из коробки %s в %s ", box1.getName(), box3.getName());
        box1.getInfo();
        box3.getInfo();

        // ________________________________________

        // v2--------------------------------------------
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
