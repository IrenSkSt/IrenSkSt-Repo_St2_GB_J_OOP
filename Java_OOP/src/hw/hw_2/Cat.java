package hw.hw_2;

/**
 * Cat
 */
public class Cat implements FeedPet {
    private String name;
    private int appetite;
    private String hungry="голодный";
    
    public String getHungry() {
        return hungry;
    }

    public void setHungry(String hungry) {
        this.hungry = hungry;
    }

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
    
    // public void eat() {
        
    // }

    // для нулевого варианта
    // void infoDoCat() {
    //     System.out.printf("Cat %s is eating\n", name);
    // }
}