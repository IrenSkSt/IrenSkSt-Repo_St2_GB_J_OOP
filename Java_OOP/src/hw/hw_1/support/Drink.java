package hw.hw_1.support;

/**
 * Товарная группа "Напитки" в каталоге товаров
 * Tare - тип упаковки(тары) (задан фиксированным списком - см.файл Tare)
 */
public class Drink extends Product {
    private Tare Tare;

    /**
     * Метод возвращает вид тары по продукту
     * 
     * @return - тип тары
     */
    public Tare getTare() {
        return this.Tare;
    }

    public Drink(Brand BrandProduct, Double priceProduct, Tare tareProduct) {
        super(BrandProduct, priceProduct);
        this.name = "Напиток газированный";
        this.Tare = tareProduct;
    }

    @Override
    public String toString() {

        return String.format("%s %s %s %s л         \tцена: %.2f руб.", name, Brand, Tare, Tare.getVolume(), price);
    }

}
