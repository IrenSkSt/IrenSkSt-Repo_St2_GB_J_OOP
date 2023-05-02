package hw.hw_1.support;

import java.util.ArrayList;
import java.util.List;

public class AdminCatalog {
    private static final List<Product> catalog = new ArrayList<>();

    public static void createCatalog() {
        addProductsToCatalog();
        showProdactsCatalog();
    }

    private static void showProdactsCatalog() {
        System.out.println("Перечнь товаров: ");
        for (Product product : catalog) {
            System.out.println(product);
        }
    }

    public static void addProductsToCatalog() {
        // Product product1Test = new Product();
        // catalog.add(product1Test);
        // Product product2Test = new Product(Brand.Cola, 30.0);
        // catalog.add(product2Test);
        Product product3 = new Drink(Brand.Cola, 30.55, Tare.bottle);
        catalog.add(product3);
        Product product4 = new Drink(Brand.Sprite, 40.0, Tare.bottle);
        catalog.add(product4);
        Product product5 = new Drink(Brand.Fanta, 37.0, Tare.bottle);
        catalog.add(product5);
        Product product6 = new Drink(Brand.Cola, 40.52, Tare.can);
        catalog.add(product6);
        Product product7 = new Drink(Brand.Sprite, 42.0, Tare.can);
        catalog.add(product7);
        Product product8 = new Drink(Brand.Pepsi, 43.35, Tare.can);
        catalog.add(product8);

        // System.out.println(product1Test); // для проверки
        // System.out.println(product2Test); // для проверки
        // System.out.println(product3); // для проверки
        // System.out.println(catalog); // для проверки

    }
}
