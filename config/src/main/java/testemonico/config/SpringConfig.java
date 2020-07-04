package testemonico.config;

import testemonico.repository.InMemoryProductRepository;
import testemonico.usecase.CreateProduct;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.ProductRepository;
import testemonico.uuid.UuidGenerator;

public class SpringConfig {
    private final ProductRepository productRepository = new InMemoryProductRepository();
    private final IdGenerator idGenerator = new UuidGenerator();

    public CreateProduct createProduct() {
        return new CreateProduct(productRepository, idGenerator);
    }
}
