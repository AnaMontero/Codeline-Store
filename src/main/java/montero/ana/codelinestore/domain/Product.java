package montero.ana.codelinestore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String image;
    private String shortDescription;
    private String highlightedAttribute;
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
        this.completeDescription = completeDescription;
        this.reference = reference;
        this.price = price;
        this.symbol = symbol;
    }
}