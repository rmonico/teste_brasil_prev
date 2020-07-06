package testemonico.controller.order;

import lombok.Builder;
import testemonico.usecase.order.crud.*;

@Builder
public class OrderController {
    private final CreateOrder createOrder;
    private final UpdateOrder updateOrder;
    private final DeleteOrder deleteOrder;
    private final FindAllOrders findAllOrders;
    private final FindOrderById findOrderById;
}
