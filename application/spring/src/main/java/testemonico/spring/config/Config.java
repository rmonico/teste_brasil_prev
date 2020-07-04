package testemonico.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testemonico.config.SpringConfig;
import testemonico.controller.ProductController;
import testemonico.usecase.CreateProduct;

@Configuration
public class Config {

    private final SpringConfig config = new SpringConfig();

    @Bean
    public ProductController productController() {
        return new ProductController(createProduct());
    }

    private CreateProduct createProduct() {
        return config.createProduct();
    }
}
