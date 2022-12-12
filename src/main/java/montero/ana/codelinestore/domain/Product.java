package montero.ana.codelinestore.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

//Reference for currency: https://www.javatpoint.com/post/java-currency-getsymbol-method
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

}