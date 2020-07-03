package testemonico.usecase.port;

import testemonico.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product create(Product product);

    Optional<Product> findById(String id);

    List<Product> findAll();
}
