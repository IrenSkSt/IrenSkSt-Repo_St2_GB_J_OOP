package hw.hw_6;

import java.util.Scanner;

public class ReaderOrderFromConsole {

    private Order order;

    public void inputFromConsole(Order order) {
        order.setNameCustomer(prompt("Имя клиента: "));
        order.setProduct(prompt("Товар: "));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
        order.setQnt(Integer.parseInt(prompt("Количество: ")));

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
