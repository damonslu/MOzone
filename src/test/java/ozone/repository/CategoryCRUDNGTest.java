package ozone.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ozone.App;
import ozone.conf.factory.CategoryFactory;
import ozone.conf.factory.ProductFactory;
import ozone.domain.Category;
import ozone.domain.Product;


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
        List<Product> product1 = (List<Product>) ProductFactory.createProduct(800, 1, "Reading Contacts");
        List<Product> product2 = (List<Product>) ProductFactory.createProduct(450, 3, "Sunglass");

        Category category1 = CategoryFactory.createCategory("ContactLens","Reading contacts", (List<Product>) product1);
       Category category2 = CategoryFactory.createCategory("ContactLens","Reading contacts", (List<Product>) product2);

                      
             repository.save(category1);
             repository.save(category2);
             id = category1.getId();
             id = category2.getId();

        Assert.assertNotNull(category1);
       Assert.assertNotNull(category2);

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

               
        