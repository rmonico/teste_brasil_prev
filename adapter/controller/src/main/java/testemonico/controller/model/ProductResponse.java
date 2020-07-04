package testemonico.controller.model;

import testemonico.domain.entity.Product;

public class ProductResponse extends AbstractProductDTO {
    public ProductResponse(Product product) {
        setId(product.getId());
        setName(product.getName());
        setPrice(product.getPrice());
    }
}
