package enums.entities;

/**
 * Enumeração que representa os possíveis status de um pedido (Order).
 */
public enum OrderStatus {
    PENDING_PAYMENT, // Pedido está aguardando pagamento
    PROCESSING,      // Pedido está em processamento
    SHIPPED,         // Pedido foi enviado
    DELIVERED        // Pedido foi entregue
}