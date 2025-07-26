package enums;

import enums.entities.Order;
import enums.entities.OrderStatus;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Classe principal que simula a criação de um pedido, com entrada de dados do usuário.
 */
public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Entrada: data e hora do pedido
        System.out.println("Enter order data:");
        System.out.print("Moment (dd/MM/yyyy HH:mm:ss): ");
        Date moment = sdf.parse(sc.nextLine());

        // Entrada: status do pedido (deve ser compatível com o enum OrderStatus)
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        // Criação do objeto Order
        Order order = new Order(moment, status);

        // Exibição dos dados do pedido
        System.out.println(order);

        sc.close();
    }
}
