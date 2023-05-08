package hw.hw_2;

public interface ControlFood {
    int getFood();

    void setAdditive(int additive);

    default boolean AddFoodAuto(String hungry, int appetite) {

        if (hungry.equals("голодный")) {
            this.setAdditive(appetite - this.getFood());
            System.out.printf("Положили добавку в тарелку %d единиц еды. \n", (appetite - this.getFood()));
            return true;
        }
        return false;

    }

}
