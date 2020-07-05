package testemonico.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Order extends Entity<String> {

    private Customer customer;
    private List<OrderItem> items;
    private BigDecimal totalPrice;
}
