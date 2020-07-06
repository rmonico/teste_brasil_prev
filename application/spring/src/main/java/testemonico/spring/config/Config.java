package testemonico.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testemonico.config.SpringConfig;
import testemonico.controller.ProductController;

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

}
