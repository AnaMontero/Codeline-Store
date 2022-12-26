package montero.ana.codelinestore.domain;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


class CatalogueTest {

    private final Catalogue catalogue = new Catalogue();
    private Product product1;

    @BeforeEach
    void setUp() {
        product1 = new Product("TestTV", "📺", "Test television",
                "Test 13", "With this test panoramic television, your friday nights will be boring no more.",
                "TestW2C", new BigDecimal("0.99"), Currency.getInstance("USD").getSymbol());
        var product2 = new Product("TestPiano", "🎹", "Test musical keyboard", "Test 4 octaves", "Tired of your " +
                "noisy neighbourgh? Play this test untuned musical keyboard for " + "two hours at home and your " +
                "neighbour will be ready to move to a building far away from you.", "TestX4A", new BigDecimal("1.00")
                , Currency.getInstance("MXN").getSymbol());

        catalogue.addToCatalogue(product1);
        catalogue.addToCatalogue(product2);
    }

    @Test
    @DisplayName("Should get all products")
    void test_GetAllProducts_Ok() {
        var loadedProducts = catalogue.getCatalogue();
        assertThat(loadedProducts).size().isEqualTo(2);
    }

    @Test
    @DisplayName("Should return contained product")
    void test_GetAllProductsContains_Ok() {
        var loadedProducts = catalogue.getCatalogue();
        assertThat(loadedProducts.contains(product1)).isTrue();
    }

    @Test
    @DisplayName("Should add to catalogue")
    void test_AddToCatalogue_Ok() {
        var product3 = new Product();
        var previousCatalogueSize = catalogue.size();

        catalogue.addToCatalogue(product3);
        var currentCatalogueSize = catalogue.size();
        assertThat(currentCatalogueSize).isEqualTo(previousCatalogueSize + 1);
    }

    @Test
    @DisplayName("Should invoke addToCatalogue method once")
    void test_AddToCatalogueOnce_Ok() {
        var mockedProduct = mock(Product.class);
        var mockedCatalogue = mock(Catalogue.class);
        mockedCatalogue.addToCatalogue(mockedProduct);
        verify(mockedCatalogue, times(1)).addToCatalogue(mockedProduct);
    }
}