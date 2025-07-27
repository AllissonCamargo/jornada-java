package compositions.exercise2.entities;

import enums.entities.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();


    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {
    }

    public Order(Client client, OrderStatus status, Date moment) {
        this.client = client;
        this.status = status;
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public double totalValue(){
        double sum = 0.0;
        for (OrderItem it : items){
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(simpleDateFormat.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items){
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", totalValue()));
        return sb.toString();
    }
}
