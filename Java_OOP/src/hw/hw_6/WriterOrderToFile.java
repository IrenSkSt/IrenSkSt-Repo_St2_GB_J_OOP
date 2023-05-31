package hw.hw_6;

import java.io.FileWriter;
import java.io.Writer;

import javax.sound.sampled.AudioFormat.Encoding;

/**
 * Запись заказа в файл .json
 * 
 * @param order    - заказ
 * @param fileName - имя файла для записи заказа
 * @param count    - счетчик файлов - указывается в имени файла (старт с 1)
 */
public class WriterOrderToFile {

    private Order order;
    private String fileName;

    static int count;
    {
        ++count;
    }

    public WriterOrderToFile(Order order) {
        this.order = order;
        this.fileName = String.format("Order_%d.json", count);
    }

    public void saveOrderToFileJson() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            // .setDefaultEncoding("UTF-8");
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getNameCustomer() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
            System.out.printf("Ваш заказ сохранен в файл %s\n", fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
