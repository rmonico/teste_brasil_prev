package testemonico.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItem extends Entity<String>  {

    private Product product;
    private BigDecimal quantity;
}
