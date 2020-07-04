package testemonico.controller;

import testemonico.controller.model.ProductRequest;
import testemonico.controller.model.ProductResponse;
import testemonico.usecase.CreateProduct;

public class ProductController {
    private final CreateProduct createProduct;

    public ProductController(CreateProduct createProduct) {
        this.createProduct = createProduct;
    }

    public ProductResponse createProduct(ProductRequest request) {
        var product = request.toProduct();

        return new ProductResponse(createProduct.create(product));
    }
}
