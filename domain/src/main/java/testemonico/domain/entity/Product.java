package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Product implements BaseEntity {

    private String id;
    private String name;
    private BigDecimal price;

}
