package montero.ana.codelinestore.presentation;

import montero.ana.codelinestore.domain.Catalogue;
import montero.ana.codelinestore.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatter {

    public void browseCatalogue(Catalogue catalogue){
        var products = catalogue.getCatalogue();
        for (Product product:products) {
            System.out.println(product.getImage());
            System.out.println(product.getSummary());
            System.out.println(product.getCompleteDescription());
            System.out.println("💰 Price: " + product.getPrice() + " " + product.getSymbol());
            System.out.println("Reference: " + product.getReference() + "\n");
        }
    }
}
