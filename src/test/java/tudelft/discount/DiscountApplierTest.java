package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    public void normal(){
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product product = new Product("prod", 1, "NORMAL");
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();
        Assertions.assertEquals(1, results.get(0).getPrice());
    }

    @Test
    public void home(){
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product product = new Product("prod", 1, "HOME");
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();
        Assertions.assertEquals(0.9, results.get(0).getPrice());
    }

    @Test
    public void business(){
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product product = new Product("prod", 1, "BUSINESS");
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();
        Assertions.assertEquals(1.1, results.get(0).getPrice());
    }

}
