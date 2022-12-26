package montero.ana.codelinestore.application;

import montero.ana.codelinestore.data.ProductRepository;
import montero.ana.codelinestore.domain.Catalogue;
import montero.ana.codelinestore.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;
    private final Catalogue catalogue = new Catalogue();

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Catalogue loadCatalog() {
        List<Product> products = productRepository.findAll();
        for (Product product: products) {
            catalogue.addToCatalogue(product);
            }
        return catalogue;
    }

    @Override
    public int getProductStock(String productReference) {
        List<Product> products = productRepository.findProductByReference(productReference);
        return products.size();
    }
}