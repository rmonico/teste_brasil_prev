package testemonico.repository;

import testemonico.domain.entity.Product;
import testemonico.usecase.port.ProductRepository;

import java.util.*;

public class InMemoryProductRepository implements ProductRepository {

    private Map<String, Product> database = new HashMap<>();

    @Override
    public Product create(Product product) {
        database.put(product.getId(), product);

        return product;
    }

    @Override
    public Optional<Product> findById(String id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(database.values());
    }
}
