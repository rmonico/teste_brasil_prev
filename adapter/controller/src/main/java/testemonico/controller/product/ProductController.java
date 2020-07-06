package testemonico.controller.product;

import lombok.Builder;
import testemonico.controller.product.model.ProductRequest;
import testemonico.controller.product.model.ProductResponse;
import testemonico.domain.entity.Product;
import testemonico.usecase.product.crud.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.String.format;

@Builder
public class ProductController {
    private final CreateProduct createProduct;
    private final UpdateProduct updateProduct;
    private final DeleteProduct deleteProduct;
    private final FindAllProducts findAllProducts;
    private final FindProductById findProductById;

    public ProductResponse createProduct(ProductRequest request) {
        var product = request.toProduct();

        return new ProductResponse(createProduct.create(product));
    }

    public ProductResponse updateProduct(ProductRequest request) {
        var product = request.toProduct();

        return new ProductResponse(updateProduct.update(product));
    }

    public ProductResponse deleteProduct(String id) {
        return new ProductResponse(deleteProduct.delete(id));
    }

    public List<ProductResponse> findAllProducts() {
        return findAllProducts.findAll().stream().map(ProductResponse::new).collect(Collectors.toList());
    }

    public ProductResponse findProductById(String id) {
        Product rawProduct = findProductById.findById(id).orElseThrow(() -> new RuntimeException(format("Product not found (%s)", id)));

        return new ProductResponse(rawProduct);
    }
}
