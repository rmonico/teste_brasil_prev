package testemonico.controller.product.model;

import testemonico.domain.entity.Product;

public class ProductRequest extends AbstractProductDTO {
    public Product toProduct() {
        return Product.builder()
                .id(getId())
                .name(getName())
                .price(getPrice())
                .build();
    }
}
