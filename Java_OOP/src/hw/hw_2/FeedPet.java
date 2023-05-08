package hw.hw_2;

public interface FeedPet {
    
    String getName();
    int getAppetite();
    void setHungry(String string);
    String getHungry();

    default boolean eat(int food) {

        if(food >0 && food >= this.getAppetite()) {
            this.setHungry("сытый");
            System.out.printf("Кот %s съел %d единиц еды. ", this.getName(), this.getAppetite());
            System.out.printf("Кот %s %s. \n", this.getName(), this.getHungry());
            return true;
        } else {
            System.out.printf("Для кота %s недостаточно %d единиц еды. ", this.getName(), food);
            System.out.printf("Кот %s %s. \n", this.getName(), this.getHungry());
            return false;
        }
        
    }
}
