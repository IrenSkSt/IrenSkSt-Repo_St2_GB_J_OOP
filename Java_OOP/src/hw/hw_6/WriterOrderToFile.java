package hw.hw_6;

import java.io.FileWriter;

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

            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getNameCustomer() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
