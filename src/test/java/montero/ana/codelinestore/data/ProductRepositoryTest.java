package montero.ana.codelinestore.data;

import montero.ana.codelinestore.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        var products = List.of(
          new Product(),
          new Product(),
          new Product()
        );
        productRepository.saveAll(products);
    }

    @Test
    @DisplayName("Should save 3 products in DB")
    void test_saveProduct_adding3ok() {
        assertEquals(3, productRepository.count());
    }
}