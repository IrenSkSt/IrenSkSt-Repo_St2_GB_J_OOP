package hw.hw_2;

public class Main {
    public static void main(String[] args) {
        
        Cat cat0 = new Cat("Рыжик", 10);
        Plate plate0 = new Plate(15);

        plate0.info();
        cat0.eat();
        cat0.infoDoCat();

        plate0.setFood(plate0.getFood() - cat0.getAppetite());
        plate0.info();
    }
}
