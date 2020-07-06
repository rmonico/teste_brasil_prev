package testemonico.usecase.product.crud;

import testemonico.domain.entity.Product;
import testemonico.usecase.base.crud.AbstractFindAllEntity;
import testemonico.usecase.port.ProductRepository;

public class FindAllProduct extends AbstractFindAllEntity<Product, String, ProductRepository> {

    public FindAllProduct(ProductRepository repository) {
        super(repository);
    }
}

