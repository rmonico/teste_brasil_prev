package testemonico.usecase.port;

import testemonico.domain.entity.Customer;
import testemonico.usecase.port.BaseRepository;

public interface CustomerRepository extends BaseRepository<Customer, String> {
}
