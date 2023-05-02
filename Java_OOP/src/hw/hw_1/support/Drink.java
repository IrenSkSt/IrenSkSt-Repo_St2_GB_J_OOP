package hw.hw_1.support;

public class Drink extends Product {
    private Tare Tare;

    public Tare getTare() {
        return Tare;
    }

    public Drink(Brand BrandProduct, Double priceProduct, Tare tareProduct) {
        super(BrandProduct, priceProduct);
        this.name = "Напиток газированный";
        this.Tare = tareProduct;
    }

    @Override
    public String toString() {

        return String.format("%s %s %s %s л - %.2f руб.", name, Brand, Tare, Tare.getVolume(), price);
    }

}
