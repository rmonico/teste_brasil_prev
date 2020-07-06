package testemonico.config;

import testemonico.repository.InMemoryProductRepository;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.ProductRepository;
import testemonico.usecase.product.crud.*;
import testemonico.uuid.UuidGenerator;

public class SpringConfig {
    private final ProductRepository productRepository = new InMemoryProductRepository();
    private final IdGenerator<String> idGenerator = new UuidGenerator<String>();

    public CreateProduct createProduct() {
        return new CreateProduct(productRepository, idGenerator);
    }

    public UpdateProduct updateProduct() {
        return new UpdateProduct(productRepository);
    }

    public DeleteProduct deleteProduct() {
        return new DeleteProduct(productRepository);
    }

    public FindAllProducts findAllProducts() {
        return new FindAllProducts(productRepository);
    }

    public FindProductById findProductById() {
        return new FindProductById(productRepository);
    }
}
