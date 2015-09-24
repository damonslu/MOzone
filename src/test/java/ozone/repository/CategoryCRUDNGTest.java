package ozone.repository;

import java.util.List;
import ozone.App;
import ozone.conf.factory.CategoryFactory;
import ozone.domain.Category;
import ozone.conf.factory.ProductFactory;
import ozone.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import org.testng.Assert;


/**
 * Created by hashcode on 2015/04/13.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CategoryCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;

    @Autowired
    private CategoryRepository repository;
    @Test
    public void create() throws Exception {
        //System.out.println("Hello world");
        Product products = ProductFactory.createProduct(800, 1, "Reading Contacts");
        Category category = CategoryFactory.createCategory("ContactLens","Reading contacts", (List<Product>) products);
                      
             repository.save(category);
             id = category.getId();
        Assert.assertNotNull(category);
    }
    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Category category = repository.findOne(id);
        Assert.assertNotNull(category);
    }
 @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }
     /*@Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Category category = repository.findOne(id);
        repository.delete(category);
        Category deletedcategory = repository.findOne(id);
        Assert.assertNull(deletedcategory);
    }*/
    }   

               
        