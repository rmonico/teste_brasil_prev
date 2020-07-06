package testemonico.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testemonico.config.SpringConfig;
import testemonico.controller.customer.CustomerController;
import testemonico.controller.order.OrderController;
import testemonico.controller.product.ProductController;

@Configuration
public class Config {

    private final SpringConfig config = new SpringConfig();

    @Bean
    public ProductController productController() {
        return ProductController.builder()
                .createProduct(config.createProduct())
                .updateProduct(config.updateProduct())
                .deleteProduct(config.deleteProduct())
                .findAllProducts(config.findAllProducts())
                .findProductById(config.findProductById())
                .build();
    }

    @Bean
    public CustomerController customerController() {
        return CustomerController.builder()
                .createCustomer(config.createCustomer())
                .updateCustomer(config.updateCustomer())
                .deleteCustomer(config.deleteCustomer())
                .findAllCustomers(config.findAllCustomers())
                .findCustomerById(config.findCustomerById())
                .build();
    }

    @Bean
    public OrderController orderController() {
        return OrderController.builder()
                .createOrder(config.createOrder())
                .updateOrder(config.updateOrder())
                .deleteOrder(config.deleteOrder())
                .findAllOrders(config.findAllOrders())
                .findOrderById(config.findOrderById())
                .build();
    }
}
