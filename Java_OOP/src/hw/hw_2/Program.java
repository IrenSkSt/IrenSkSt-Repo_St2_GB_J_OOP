// Реализация с учетом вводных данных в условиях задачи

package hw.hw_2;

public class Program {
    public static void main(String[] args) {

        // по базовым условиям задачи:
        // -------------------------------------
        // Cat cat0 = new Cat("Рыжик", 10);
        // Plate plate0 = new Plate(15);
        // plate0.info();
        // cat0.eat();
        // cat0.infoDoCat();
        // plate0.setFood(plate0.getFood() - cat0.getAppetite());
        // plate0.info();
        // System.out.println();
        // ------------------------------------

        // задание 1-2 в варианте 1 кот = 1 тарелка
        // имитация кормления питомца, добавления корма юзером,
        // добавления корма автоматически по норме потребления животного
        // место содержания №1------------------------------------
        Cat cat1 = new Cat("Мурзик", 15);
        Plate plate1 = new Plate(10);

        plate1.info();
        cat1.eat(plate1);
        // plate1.info(); // для проверки
        // cat1.eat(50); // для проверки
        // plate1.setFood(150); // для проверки
        // plate1.info(); // для проверки
        // cat1.eat(5); // для проверки
        plate1.addFood(3);
        plate1.info();
        plate1.AddFoodAuto(cat1);
        plate1.info(); // для проверки
        cat1.eat(plate1);
        System.out.println();
        // ---------------------------------------------------

        // место содержания №2------------------------------------
        Cat cat2 = new Cat("Пушок", 8);
        Plate plate2 = new Plate(10);
        plate2.info();
        cat2.eat(plate2);
        plate2.info();
        // cat2.eat(plate2); // для проверки
        // --------------------------------------------------

        System.out.println("-------------------------------------");

        // задание 1-4 = вариант несколько кошек - 1 тарелка на всех
        // питомцы по очередности допускаются к миске
        // место содержания №2------------------------------------
        /**
         * имитация кормления группы питомцев из одном миски
         * добавления корма юзером
         * добавления корма автоматически по норме потребления каждого питомца
         */
        Cat[] cats = {
                new Cat("Симбо", 7),
                new Cat("Рыжик", 10),
                new Cat("Барон", 15) };

        Plate plate = new Plate(10);

        System.out.println("\nОтчет по выдаче корма питомцам: ");
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            while (cats[i].getHungry() == "голодный") {
                for (Cat cat : cats) {
                    if (cat.getHungry().equals("голодный"))
                        cat.eat(plate);
                }
                System.out.println();
                plate.info();
                if (i < cats.length - 1)
                    plate.addFood(5);

            }
            if (i < cats.length - 1)
                plate.AddFoodAuto(cats[i + 1]);
        }

    }
}
