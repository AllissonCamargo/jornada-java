package enums.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que representa um pedido (Order), contendo dados como data, status e cliente.
 */
public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;           // Data e hora do pedido
    private OrderStatus status;    // Status atual do pedido

    public Order(int i, Date date, OrderStatus pendingPayment) {
    }

    /**
     * Construtor com parâmetros.
     *
     * @param moment Data e hora do pedido
     * @param status Status do pedido
     */
    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * Retorna uma representação textual do pedido.
     */
    @Override
    public String toString() {
        return "Order moment: " + sdf.format(moment) + "\nOrder status: " + status;
    }
}