package montero.ana.codelinestore.data;

import montero.ana.codelinestore.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
