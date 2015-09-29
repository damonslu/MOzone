package ozone.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ozone.App;
import ozone.conf.factory.ProductFactory;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/04/13.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ProductCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;

    @Autowired
    private ProductRepository repository;
    @Test
    public void create() throws Exception {
        //System.out.println("Hello world");
        Product product = ProductFactory.createProduct(500, 4, "GucciBag");             
             repository.save(product);
             id = product.getId();
        Assert.assertNotNull(product);
    }
    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Product product = repository.findOne(id);
        Assert.assertNotNull(product);
    }
 @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }
     /*@Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Product product = repository.findOne(id);
        repository.delete(product);
        Product deletedproduct = repository.findOne(id);
        Assert.assertNull(deletedproduct);
    }*/
    }   

               
        