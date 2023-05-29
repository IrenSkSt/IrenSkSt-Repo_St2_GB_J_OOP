package hw.hw_6;

public class OrderProduct {

    public static void createOrderProduct() {

        // вариант - ввели данные заказа и вывели в консоль
        Order order0 = new Order("Аня", "Комод", 1, 350); // для проверки
        System.out.println(order0); // для проверки
        WriterOrderToFile writerOrderToFile = new WriterOrderToFile(order0); // для проверки
        writerOrderToFile.saveOrderToFileJson(); // для проверки
    }

}
