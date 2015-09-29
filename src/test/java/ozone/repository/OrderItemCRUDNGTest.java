package ozone.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import ozone.App;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/04/13.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class OrderItemCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;
    private List<Product> product;
    @Autowired
    private OrderItemRepository repository;
    
    @Test
    public void create() throws Exception {
        /*Sstem.out.println("Hello world");
        OrderItem orderitem = OrderItemFactory.createOrderItem("dfd", 4, "Wow",product);
             repository.save(orderitem);
             id = orderitem.getId();
        Assert.assertNotNull(orderitem);
    }
    /*@Test(dependsOnMethods = "create")
    public void read() throws Exception {
        OrderItem orderitem = repository.findOne(id);
        Assert.assertNotNull(orderitem);
    }
 @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }
     /*@Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        OrderItem orderitem = repository.findOne(id);
        repository.delete(orderitem);
        OrderItem deletedorderitem = repository.findOne(id);
        Assert.assertNull(deletedorderitem);
    }*/
    }   
}

               
        