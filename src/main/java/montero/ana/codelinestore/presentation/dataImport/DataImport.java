package montero.ana.codelinestore.presentation.dataImport;

import montero.ana.codelinestore.domain.Catalogue;
import montero.ana.codelinestore.domain.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Component
public class DataImport {
    private Catalogue catalogue;

    public DataImport(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    private ArrayList<Product> products = new ArrayList<>(List.of(
            new Product("TV", "📺", "Glamorous panoramic television",
                    "13 inches", "With this panoramic television, your friday nights will be boring no more.",
                    "W2C", new BigDecimal("300.99"), Currency.getInstance("EUR").getSymbol()),
            new Product("Piano", "🎹", "Untuned musical keyboard",
                    "4 octaves", "Tired of your noisy neighbourgh? Play this untuned musical keyboard for " +
                    "two hours at home and your neighbour will be ready to move to a building far away from you.",
                    "X4A", new BigDecimal("1003.00"), Currency.getInstance("EUR").getSymbol())));

    public Catalogue loadCatalog(){
        for (Product product: products) {
            catalogue.addToCatalogue(product);
        }
        return catalogue;
    }
}