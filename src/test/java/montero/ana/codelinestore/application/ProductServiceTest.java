package montero.ana.codelinestore.application;

import montero.ana.codelinestore.domain.Catalogue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    @Test
    @DisplayName("Should return catalogue")
    void test_LoadCatalogue_Ok() {
        var mockedProductService = mock(ProductService.class);

        var mockedCatalogue = mock(Catalogue.class);
        when(mockedProductService.loadCatalog()).thenReturn(mockedCatalogue);
    }
}