package hw.hw_2;

/**
 * ControlFood - шаблон автоматической операции добавки корма в миску по норме
 * потребления питомца
 * 
 */
public interface ControlFood {
    int getFood();

    void setFood(int food);

    default boolean AddFoodAuto(Cat cat) {
        if (cat.getHungry().equals("голодный") && this.getFood() < cat.getAppetite()) {
            int additive = cat.getAppetite() - this.getFood();
            if (cat.getHungry().equals("голодный")) {
                // this.setAdditive(additive);
                this.setFood(this.getFood() + additive);
                System.out.printf("Аппарат положил добавку в тарелку %d единиц еды, чтобы накормить кота %s. \n",
                        additive,
                        cat.getName());
                return true;
            }
        }
        return false;

    }

}
