package hw.hw_2;

/**
 * Cat
 */
public class Cat {
    private String name;
    private int appetite;
    
    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    
    public void eat() {

    }

    void infoDoCat() {
        System.out.printf("Cat %s is eating\n", name);
    }
}