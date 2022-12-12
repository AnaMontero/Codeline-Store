package montero.ana.codelinestore.application;

import montero.ana.codelinestore.data.ProductRepository;
import montero.ana.codelinestore.domain.Catalogue;
import montero.ana.codelinestore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    private Catalogue catalogue = new Catalogue();

    @Override
    public Catalogue loadCatalog() {
        List<Product> products = productRepository.findAll();
        for (Product product: products) {
            catalogue.addToCatalogue(product);
            }
        return catalogue;
    }
}
