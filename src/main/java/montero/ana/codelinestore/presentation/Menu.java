package montero.ana.codelinestore.presentation;

import montero.ana.codelinestore.application.ProductService;
import org.springframework.stereotype.Component;

@Component
public class Menu {
    final OutputFormatter outputFormatter;

    final ProductService productService;

    private String inputReader;

    public Menu(OutputFormatter outputFormatter, ProductService productService) {
        this.outputFormatter = outputFormatter;
        this.productService = productService;
    }

    public void start() {

        System.out.println("***********************************");
        System.out.println("** 🏪 WELCOME TO CODELINE STORE 🏪 **");
        System.out.println("***********************************");

        var catalogue = productService.loadCatalog();

        outputFormatter.browseCatalogue(catalogue);

        boolean exit = false;

        while (!exit) {
            showProductDetails();
            switch (inputReader) {
                case "1" -> exit = true;
                case "2" -> outputFormatter.showProductDetails(catalogue);
                default -> System.out.println("Choose a correct option.");
            }
        }
        this.exit();
    }

    private void showProductDetails() {
        inputReader = ConsoleBuilder.inputReader("""
                ¿What would you like to do next?
                1. Add product to cart
                2. Keep browsing products
                >\040""");
    }

    private void exit() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
