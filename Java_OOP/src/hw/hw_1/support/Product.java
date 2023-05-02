package hw.hw_1.support;

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
        this.name = nameProduct;
        this.Brand = BrandProduct;
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

    // public String getBrand() {
    // return Brand;
    // }

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

}
