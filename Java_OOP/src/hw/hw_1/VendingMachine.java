package hw.hw_1;

import java.util.List;

import hw.hw_1.support.Product;

/**
 * VendingMachine -Аппарат для продажи продуктов
 */
public class VendingMachine {
    private final List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products
     */
    public VendingMachine(List<Product> products) {
        this.products = products;
    }
}