package hw.hw_1;

import hw.hw_1.support.AdminCatalog;
import hw.hw_1.support.Brand;
import hw.hw_1.support.Drink;
import hw.hw_1.support.Product;
import hw.hw_1.support.Tare;

public class CustomerView {

    public static Product resultBuyProduct;

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

        /**
         * Имитация покупок по одному товару
         */
        resultBuyProduct = vendingMachineNow.getOutPosProduct(2);
        showBuyResult(resultBuyProduct);
        // System.out.println(resultBuyProduct); // для проверки
        resultBuyProduct = vendingMachineNow.getOutPosProduct(6);
        showBuyResult(resultBuyProduct);
        // System.out.println(resultBuyProduct); // для проверки

        resultBuyProduct = vendingMachineNow.getOutProduct(Brand.Cola, Tare.can);
        showBuyResult(resultBuyProduct);

    }

    private static void showBuyResult(Product res) {
        if (res == null)
            System.out.println("Такого продукта нет.");
        else
            System.out.println("\nВы купили: \n  " + res);
    }
}
