package testemonico.usecase;

import testemonico.domain.entity.Product;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.ProductRepository;

public class CreateProduct {

    private final ProductRepository repository;
    private final IdGenerator idGenerator;

    public CreateProduct(ProductRepository repository, IdGenerator idGenerator) {
        this.repository = repository;
        this.idGenerator = idGenerator;
    }

    public Product create(Product rawProduct) {
        var product = Product.builder()
                .id(idGenerator.generate())
                .name(rawProduct.getName())
                .price(rawProduct.getPrice())
                .build();

        return repository.create(product);
    }
}
