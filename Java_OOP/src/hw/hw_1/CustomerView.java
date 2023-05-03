package hw.hw_1;

import hw.hw_1.support.AdminCatalog;
import hw.hw_1.support.Brand;
import hw.hw_1.support.Drink;
import hw.hw_1.support.Product;
import hw.hw_1.support.Tare;

public class CustomerView {

    public static void buyProduct() {

        AdminCatalog.createCatalog();

        /**
         * Покупка товара по номеру товарной позиции в аппарате
         */
        VendingMachine vendingMachineNow = AdminCatalog.vendingMachine1;

        // Drink resultBuyProduct0 = (Drink) vendingMachineNow.getOutProduct(3); // для
        // проверки
        // System.out.println(vendingMachineNow.getProducts().size()); // для проверки
        // System.out.println(resultBuyProduct0); // для проверки

        Product resultBuyProduct;
        resultBuyProduct = vendingMachineNow.getOutProduct(2);
        // System.out.println(resultBuyProduct); // для проверки
        resultBuyProduct = vendingMachineNow.getOutProduct(6);
        // System.out.println(resultBuyProduct); // для проверки

        // Product resultBuyProduct1 = VendingMachine.getProduct(Brand.Cola,
        // Tare.bottle);

        if (resultBuyProduct == null)
            System.out.println("Такого продукта нет.");
        else
            System.out.println("\nВы купили: \n" + resultBuyProduct);
    }
}
