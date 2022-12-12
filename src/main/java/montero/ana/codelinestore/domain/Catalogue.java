package montero.ana.codelinestore.domain;

import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Product> products = new ArrayList<>();

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

    public boolean contains(Object o) {
        return products.indexOf(o) >= 0;
    }
}