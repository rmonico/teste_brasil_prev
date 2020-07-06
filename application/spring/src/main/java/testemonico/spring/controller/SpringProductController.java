package testemonico.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testemonico.controller.product.ProductController;
import testemonico.controller.product.model.ProductRequest;
import testemonico.controller.product.model.ProductResponse;

import java.util.List;

@RestController("/api/v1/product")
// TODO Fix returned status codes for all methods
public class SpringProductController {

    private final ProductController productController;

    @Autowired
    public SpringProductController(ProductController productController) {
        this.productController = productController;
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest request) {
        ProductResponse response = productController.createProduct(request);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id) {
        ProductResponse response = productController.deleteProduct(id);

        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody ProductRequest request) {
        ProductResponse response = productController.updateProduct(request);

        return ResponseEntity.ok(response);
    }

    // TODO Paging
    @GetMapping
    public ResponseEntity<?> findAllProducts() {
        List<ProductResponse> response = productController.findAllProducts();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findProductById(@PathVariable String id) {
        ProductResponse response = productController.findProductById(id);

        return ResponseEntity.ok(response);
    }
}
