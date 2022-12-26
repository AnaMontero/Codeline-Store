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
            System.out.println(getProductSummary(product));
            System.out.println(product.getCompleteDescription());
            System.out.println("💰 Price: " + product.getPrice() + " " + product.getSymbol());
            System.out.println("Reference: " + product.getReference() + "\n");
        }
    }

    private String getProductSummary(Product product) {
        return product.getShortDescription() + ", " +
                         product.getHighlightedAttribute();
    }

    public void showProductDetails(Catalogue catalogue){
        var products = catalogue.getCatalogue();
        for (Product product:products) {
            System.out.println(product.getImage());
            System.out.println("Reference: " + product.getReference());
            System.out.println("💰 Price: " + product.getPrice() + " " + product.getSymbol());
            System.out.println("Stock WIP");
            System.out.println();
            System.out.println("SUMMARY:");
            System.out.println(getProductSummary(product));
            System.out.println(product.getCompleteDescription());
            System.out.println();
            System.out.println("DESCRIPTION:");
            System.out.println(product.getCompleteDescription());
            System.out.println();
        }
    }
}