package montero.ana.codelinestore.presentation;

import montero.ana.codelinestore.application.ProductService;
import org.springframework.stereotype.Component;

@Component
public class Menu {
    final OutputFormatter outputFormatter;

    final ProductService productService;

    public Menu(OutputFormatter outputFormatter, ProductService productService){
        this.outputFormatter = outputFormatter;
        this.productService = productService;
    }

    public void start() {

        System.out.println("***********************************");
        System.out.println("** 🏪 WELCOME TO CODELINE STORE 🏪 **");
        System.out.println("***********************************");

        var catalogue = productService.loadCatalog();

        outputFormatter.browseCatalogue(catalogue);
    }

}
