package compositions.exercise2.application;

import compositions.exercise2.entities.Client;
import compositions.exercise2.entities.Order;
import compositions.exercise2.entities.OrderItem;
import compositions.exercise2.entities.Product;
import enums.entities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthdate = simpleDateFormat.parse(sc.next());

        Client cliente1 = new Client(name, email, birthdate);

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println("How many items to this order? ");
        int orderQuantity = sc.nextInt();
        sc.nextLine();
        Order order = new Order(cliente1, status, new Date());
        for (int i = 0; i < orderQuantity; i++){
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }


        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
