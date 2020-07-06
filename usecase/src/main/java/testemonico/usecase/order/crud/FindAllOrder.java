package testemonico.usecase.order.crud;

import testemonico.domain.entity.Order;
import testemonico.usecase.base.crud.AbstractFindAllEntity;
import testemonico.usecase.port.OrderRepository;

public class FindAllOrder extends AbstractFindAllEntity<Order, String, OrderRepository> {

    public FindAllOrder(OrderRepository repository) {
        super(repository);
    }
}

