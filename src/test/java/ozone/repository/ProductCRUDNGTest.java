package ozone.repository;

import ozone.App;
import ozone.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;

/**
 * Created by hashcode on 2015/04/13.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ProductCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;

    @Autowired
    ProductRepository repository;
    @Test
    public void Create() throws Exception {
        System.out.println("Hello world");
        List<Product> products = new ArrayList<>();
        Product product = new Product.Builder(500)
                .setQuantity(5)
                .setDescription("Wearable")
                .build();
                 repository.save(product);
        Assert.assertNotNull(product.getId());

        product = repository.findOne(product.getId());
        Assert.assertEquals("500", product.getPrice());


        
        repository.save(product);
        Assert.assertEquals("9876", product.getId());
        Assert.assertEquals("Wearable", product.getDescription());

       product = repository.findOne(product.getId());
        repository.delete(product);
        product = repository.findOne(product.getId());
        Assert.assertNull(product);
    }


}
