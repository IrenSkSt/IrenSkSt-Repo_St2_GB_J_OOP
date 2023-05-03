package hw.hw_1.support;

import hw.hw_1.support.Brand;

public class Product {
    protected String name;
    protected Brand Brand;
    protected Double price;

    {
        String producer;
        String country;
        String supplier;
    }

    public Product(String nameProduct, Brand BrandProduct, Double priceProduct) {

        this.Brand = BrandProduct;

        if (nameProduct.length() < 3)
            this.name = "Напиток";
        else if (nameProduct.length() > 20)
            this.name = nameProduct.substring(0, 20);
        else
            this.name = nameProduct;

        if (priceProduct <= 0.00)
            throw new RuntimeException("Некорректная цена за единицу товара.");
        else
            this.price = priceProduct;

    }

    public Product(Brand BrandProduct, Double priceProduct) {
        this("Напиток", BrandProduct, priceProduct);
    }

    public Product() {
        // this.Brand = hw.hw_1.support.Brand.NoName;
        this(hw.hw_1.support.Brand.NoName, 1.00);
    }

    // public String getName() {
    // return name;
    // }

    // protected void setName(String name) {
    // this.name = name;
    // }

    public Brand getBrand() {
        return Brand;
    }

    // protected void setBrand(String brand) {
    // Brand = brand;
    // }

    // public Double getPrice() {
    // return price;
    // }

    // protected void setPrice(Double price) {
    // this.price = price;
    // }

    @Override
    public String toString() {

        return String.format("%s %s         \tцена: %.2f руб.", name, Brand, price);
    }

    public Object getTare() {
        return null;
    }

}
