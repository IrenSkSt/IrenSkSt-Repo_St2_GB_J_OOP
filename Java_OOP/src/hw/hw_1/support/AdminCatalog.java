package hw.hw_1.support;

import java.util.ArrayList;
import java.util.List;

public class AdminCatalog {
    private static final List<Product> catalog = new ArrayList<>();

    public static void createCatalog() {
        addProductsToCatalog();
    }

    public static void addProductsToCatalog() {
        Product product1 = new Product();
        catalog.add(product1);
        Product product2 = new Product(Brand.Cola, 30.0);
        catalog.add(product2);
        Product product3 = new Drink(Brand.Cola, 30.0, Tare.bottle);
        catalog.add(product3);

        System.out.println(product1); // для проверки
        System.out.println(product2); // для проверки
        System.out.println(product3); // для проверки
        System.out.println(catalog); // для проверки

    }
}
