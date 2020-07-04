package testemonico.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import testemonico.controller.ProductController;
import testemonico.controller.model.ProductRequest;
import testemonico.controller.model.ProductResponse;

@RestController("/api/product/v1")
public class SpringController {

    private final ProductController productController;

    @Autowired
    public SpringController(ProductController productController) {
        this.productController = productController;
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest request) {
        ProductResponse response = productController.createProduct(request);

        return ResponseEntity.ok(response);
    }
}
