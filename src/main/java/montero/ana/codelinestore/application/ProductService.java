package montero.ana.codelinestore.application;

import montero.ana.codelinestore.domain.Catalogue;

public interface ProductService {
    Catalogue loadCatalog();

    int getProductStock(String productReference);
}

