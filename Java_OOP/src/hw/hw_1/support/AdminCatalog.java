package hw.hw_1.support;

import java.util.ArrayList;
import java.util.List;

import hw.hw_1.VendingMachine;

public class AdminCatalog {
    private static final List<Product> catalog = new ArrayList<>();
    public static VendingMachine vendingMachine1;

    public static void createCatalog() {

        addProductsToCatalog();

        showProdactsCatalog();

        loadProductsToVendingMashine();
    }

    private static void loadProductsToVendingMashine() {
        if (catalog.size() == 0)
            throw new RuntimeException("Нет товаров для загрузки в аппарат.");
        else {
            vendingMachine1 = new VendingMachine(catalog);
            // System.out.println(vendingMachine1.getProducts()); // для проверки
            System.out.println("Количество позиций товара в аппарате: " + vendingMachine1.getProducts().size());
        }
        System.out.println();
    }

    private static void showProdactsCatalog() {
        System.out.println("Перечнь товаров: ");
        int i = 0;
        for (Product product : catalog) {
            i++;
            System.out.println(i + "  " + product);

        }
        System.out.println();
    }

    public static void addProductsToCatalog() {

        // -------------
        // Product productTest = new Product(Brand.Cola, -20.0); // для проверки
        // catalog.add(productTest); // для проверки
        // System.out.println(productTest); // для проверки

        // Product product1Test = new Product(); // для проверки
        // catalog.add(product1Test); // для проверки
        // Product product2Test = new Product(Brand.Cola, 30.0);// для проверки
        // catalog.add(product2Test); // для проверки
        // Product product3Test = new Product("n", Brand.Cola, 30.0);// для проверки //
        // проверки
        // System.out.println(product3Test.name.length());
        // catalog.add(product3Test); // для проверки

        // System.out.println(product1Test); // для проверки
        // System.out.println(product2Test); // для проверки
        // System.out.println(product3Test); // для проверки
        // -------------

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

        // System.out.println(product3); // для проверки
        // System.out.println(catalog); // для проверки

    }
}
