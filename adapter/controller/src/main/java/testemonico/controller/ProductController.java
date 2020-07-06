package testemonico.controller;

import lombok.Builder;
import testemonico.controller.model.ProductRequest;
import testemonico.controller.model.ProductResponse;
import testemonico.usecase.product.crud.*;

@Builder
public class ProductController {
    private final CreateProduct createProduct;
    private final UpdateProduct updateProduct;
    private final DeleteProduct deleteProduct;
    private final FindAllProduct findAllProducts;
    private final FindProductById findProductById;

    public ProductResponse createProduct(ProductRequest request) {
        var product = request.toProduct();

        return new ProductResponse(createProduct.create(product));
    }
}
