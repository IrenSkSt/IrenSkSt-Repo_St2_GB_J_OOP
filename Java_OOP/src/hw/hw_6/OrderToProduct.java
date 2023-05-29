package hw.hw_6;

public class OrderToProduct {

    public static void createOrderProduct() {

        // вариант - ввели данные заказа и вывели в консоль
        // + записали в файл в формате json
        // Order order0 = new Order("Аня", "Комод", 1, 350); // для проверки
        // System.out.println(order0); // для проверки
        // WriterOrderToFile writerOrderToFile0 = new WriterOrderToFile(order0); // для
        // проверки
        // writerOrderToFile0.saveOrderToFileJson(); // для проверки
        // System.out.println("----------------------------------");

        // Вариант - заполнение полей заказа из консоли
        // и записали в файл в формате json
        System.out.println("Заполните форму заказа: ");
        ReaderOrderFromConsole readerOrderFromConsole = new ReaderOrderFromConsole();
        Order order1 = new Order(null, null, 0, 0);
        readerOrderFromConsole.inputFromConsole(order1);
        WriterOrderToFile writerOrderToFile = new WriterOrderToFile(order1);
        writerOrderToFile.saveOrderToFileJson();
        // System.out.println(order1); // для проверки
    }

}
