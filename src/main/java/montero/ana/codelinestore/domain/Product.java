package montero.ana.codelinestore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

//Reference for currency: https://www.javatpoint.com/post/java-currency-getsymbol-method
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private String shortDescription;
    private String highlightedAttribute;
    private String summary;
    private String completeDescription;
    private String reference;
    private BigDecimal price;
    private String symbol;

    public Product(String name, String image, String shortDescription, String highlightedAttribute,
                   String completeDescription, String reference, BigDecimal price, String symbol) {
        this.name = name;
        this.image = image;
        this.shortDescription = shortDescription;
        this.highlightedAttribute = highlightedAttribute;
        this.summary = shortDescription + ", " + highlightedAttribute;
        this.completeDescription = completeDescription;
        this.reference = reference;
        this.price = price;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", image='" + image + '\'' + ", " +
                "shortDescription='" + shortDescription + '\'' + ", " +
                "highlightedAttribute='" + highlightedAttribute + '\'' + ", " +
                "summary='" + summary + '\'' + ", completeDescription='" + completeDescription + '\'' + ", " +
                "reference='" + reference + '\'' + ", price=" + price + ", symbol=" + symbol + '}';
    }
}