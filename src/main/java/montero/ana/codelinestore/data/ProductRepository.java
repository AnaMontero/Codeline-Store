package montero.ana.codelinestore.data;

import montero.ana.codelinestore.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductByReference(String productReference);
}
