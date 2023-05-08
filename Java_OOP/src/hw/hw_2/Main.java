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
        //------------------------------------

        // задание 1-2
        Cat cat1 = new Cat("Мурзик", 15);
        Cat cat2 = new Cat("Пушок", 8);
        Plate plate1 = new Plate(10);

        plate1.info();
        cat1.eat(plate1.getFood());
        cat2.eat(plate1.getFood());
        


    }
}
