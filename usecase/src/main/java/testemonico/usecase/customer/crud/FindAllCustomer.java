package testemonico.usecase.customer.crud;

import testemonico.domain.entity.Customer;
import testemonico.usecase.base.crud.AbstractFindAllEntity;
import testemonico.usecase.port.CustomerRepository;

public class FindAllCustomer extends AbstractFindAllEntity<Customer, String, CustomerRepository> {

    public FindAllCustomer(CustomerRepository repository) {
        super(repository);
    }
}

