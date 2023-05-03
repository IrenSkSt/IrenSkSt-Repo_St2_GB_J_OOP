package hw.hw_1;

import java.util.Iterator;
import java.util.List;

import hw.hw_1.support.Brand;
import hw.hw_1.support.Product;
import hw.hw_1.support.Tare;

/**
 * VendingMachine -Аппарат для продажи продуктов
 * на примере напитков
 */
public class VendingMachine {
    private final List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products - перечень товарных позиций, загруженных в аппарат
     */
    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Boolean getIsReadyMachine() {
        // System.out.println(this.products.size()); // для проверки
        return this.products.size() != 0;
    }

    /**
     * Покупка товара по номеру товарной позиции в аппарате
     * 
     * @param i - позиция товара в аппарате
     * @return - товар на выдачу (возвращаем товар из списка по выбранной позиции)
     */
    // !!! при реализации запроса выбора юзера сделать вариант по позиции
    public Product getOutPosProduct(int i) {

        if (i > 0 && i < this.products.size() + 1) {

            Product product = this.products.get(i - 1);
            // System.out.println(i + " = " + product); // для проверки

            return product;
        }

        return null;
    }

    /**
     * Покупка товара по брэнду и таре (в аппарате только одно товарная группа)
     * 
     * @param brand - брэнд газированного напитка
     * @param tare  - тара (бутылка или банка)
     * @return - товар на выдачу (возвращаем товар из списка товаров в аппарате)
     */
    public Product getOutProduct(Brand brand, Tare tare) {
        Iterator iterator = this.products.iterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            if (product.getBrand().equals(brand) && product.getTare().equals(tare)) {
                // System.out.println(product.getBrand()); // для проверки
                return product;
            }
        }
        return null;

    }

    /**
     * Показать список товаров(наптков) брэнда, заданного покупателем
     * 
     * @param brand - имя брэнда
     *              pos - номер позиции товара для быстрой покупки по номеру
     */
    public void showBrandProducts(String brand) {
        System.out.println("Вы искали товары брэнда: " + brand);

        Iterator iterator = this.products.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            if (product.getBrand().toString().equals(brand)) {
                int pos = this.products.indexOf(product) + 1;
                System.out.println(pos + "  " + product);
                count++;
            }

        }
        if (count == 0)
            System.out.println("Таких товаров не найдено");
        else
            System.out.printf("Всего найдено похожих товаров : %d \n", count);

    }
}