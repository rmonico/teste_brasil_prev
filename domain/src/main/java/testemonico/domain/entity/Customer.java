package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class Customer extends Entity<String> {

    private String name;

}
