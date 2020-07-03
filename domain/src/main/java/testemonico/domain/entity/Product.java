package testemonico.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product implements BaseEntity {

    private String id;
    private String name;
    private BigDecimal price;

}
