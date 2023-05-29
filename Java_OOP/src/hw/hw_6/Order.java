package hw.hw_6;

public class Order {
    private String nameCustomer;
    private String product;
    private int qnt;
    private float price;

    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public float getPrice() {
        return price;
    }

    public Order(String nameCustomer, String product, int qnt, float price) {
        this.nameCustomer = nameCustomer;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    @Override
    public String toString() {

        return String.format("%s, \nВаш заказ:  %s \tцена = %.2f у.е. \tколичество = %d шт.\n", nameCustomer, product,
                price, qnt);
    }

}
