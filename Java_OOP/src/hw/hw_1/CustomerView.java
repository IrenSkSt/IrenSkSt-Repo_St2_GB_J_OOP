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

        // Boolean readyMachine = AdminCatalog.vendingMachine1.getIsReadyMachine();
        // System.out.println(readyMachine);
        if (AdminCatalog.vendingMachine1.getIsReadyMachine())
            buyOneProduct();
        else
            System.out.println("В аппарате нет товаров");

    }

    private static void buyOneProduct() {
        /**
         * Покупка товара по номеру товарной позиции в аппарате
         */
        VendingMachine vendingMachineNow = AdminCatalog.vendingMachine1;
        // Drink resultBuyProduct0 = (Drink) vendingMachineNow.getOutProduct(3); // для
        // проверки
        // System.out.println(vendingMachineNow.getProducts().size()); // для проверки
        // System.out.println(resultBuyProduct0); // для проверки

        vendingMachineNow.showBrandProducts("Cola"); // показать товары по брэнду

        /**
         * Имитация покупок по одному товару
         * вариант 1 - по номеру товара (так сейчас реализованы вендингАппараты в
         * реальности) = в идеале надо по ID товарной позиции
         * вариант2 - выбирает брэнд и тару (сейчас только напитки в аппарате) = аналог
         * когда кнопка или галочка, т.е. выбор из фиксированного набора
         */
        resultBuyProduct = vendingMachineNow.getOutPosProduct(2); // 1 вариант
        showBuyResult(resultBuyProduct);
        // System.out.println(resultBuyProduct); // для проверки
        resultBuyProduct = vendingMachineNow.getOutPosProduct(6);
        showBuyResult(resultBuyProduct);
        // System.out.println(resultBuyProduct); // для проверки

        resultBuyProduct = vendingMachineNow.getOutProduct(Brand.Cola, Tare.can); // 2 вариант
        showBuyResult(resultBuyProduct);

        resultBuyProduct = vendingMachineNow.getOutProduct(Brand.Fanta, Tare.bottle);
        showBuyResult(resultBuyProduct);
    }

    private static void showBuyResult(Product res) {
        if (res == null)
            System.out.println("Такого продукта нет.");
        else
            System.out.println("\nВы купили: \n   " + res);
    }
}
