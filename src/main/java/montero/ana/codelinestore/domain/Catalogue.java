package montero.ana.codelinestore.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Catalogue {
    private final ArrayList<Product> products = new ArrayList<>();

    public Catalogue() {
    }

    public void addToCatalogue(Product product){
        if(!this.getCatalogue().contains(product)) this.products.add(product);
    }

    public ArrayList<Product> getCatalogue() {
        return this.products;
    }

    public int size() {
        return products.size();
    }
}