package testemonico.controller.product.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AbstractProductDTO {
    private String id;
    private String name;
    private BigDecimal price;

}
