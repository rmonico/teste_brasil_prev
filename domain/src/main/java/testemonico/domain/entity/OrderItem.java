package testemonico.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItem implements BaseEntity {

    private String id;
    private Product product;
    private BigDecimal quantity;
}
