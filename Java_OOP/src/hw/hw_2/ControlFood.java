package hw.hw_2;

public interface ControlFood {
    int getFood();

    void setFood(int food);

    // void setAdditive(int additive);

    default boolean AddFoodAuto(Cat cat) {

        int additive = cat.getAppetite() - this.getFood();
        if (cat.getHungry().equals("голодный")) {
            // this.setAdditive(additive);
            this.setFood(this.getFood() + additive);
            System.out.printf("Положили добавку в тарелку %d единиц еды. \n", (additive));
            return true;
        }
        return false;

    }

}
