// Реализация с учетом вводных данных в условиях задачи

package hw.hw_2;

public class Main {
    public static void main(String[] args) {

        // по базовым условиям:
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
        Cat cat1 = new Cat("Мурзик", 15);
        Plate plate1 = new Plate(10);

        plate1.info();
        cat1.eat(plate1.getFood());
        plate1.info();
        cat1.eat(50); // для проверки
        plate1.info(); // для проверки
        cat1.eat(5);
        System.out.println();

        Cat cat2 = new Cat("Пушок", 8);
        Plate plate2 = new Plate(10);
        plate2.info();
        cat2.eat(plate2.getFood());
        plate2.info();
        cat2.eat(plate2.getFood());

    }
}
