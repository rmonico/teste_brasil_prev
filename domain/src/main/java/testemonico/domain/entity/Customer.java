package testemonico.domain.entity;

import lombok.Data;

@Data
public class Customer implements BaseEntity {

    private String id;
    private String name;

}
