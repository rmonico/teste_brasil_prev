package testemonico.controller.customer;

import lombok.Builder;
import testemonico.usecase.customer.crud.*;

@Builder
public class CustomerController {

    private final CreateCustomer createCustomer;
    private final UpdateCustomer updateCustomer;
    private final DeleteCustomer deleteCustomer;
    private final FindAllCustomers findAllCustomers;
    private final FindCustomerById findCustomerById;

}
