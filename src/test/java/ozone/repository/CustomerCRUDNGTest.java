package ozone.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ozone.App;
import ozone.conf.factory.AddressFactory;
import ozone.conf.factory.ContactFactory;
import ozone.conf.factory.CustomerFactory;
import ozone.conf.factory.DemographicFactory;
import ozone.conf.factory.NameFactory;
import ozone.conf.factory.OrderItemFactory;
import ozone.conf.factory.ProductFactory;
import ozone.domain.Address;
import ozone.domain.Contact;
import ozone.domain.Customer;
import ozone.domain.Demographic;
import ozone.domain.Name;
import ozone.domain.OrderItem;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/04/13.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CustomerCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;
    

    @Autowired
    private CustomerRepository repository;
    @Test
    public void create() throws Exception {
        //System.out.println("Hello world");
        Name name = NameFactory.createName("Lio", "Don");
        Address address = AddressFactory.createAddress("7869", "23 HerriStreet", "HerrieStreet");
        Contact contact = ContactFactory.createContact("757688", "7575875", "DonL@gmail.com");
        Demographic demo = DemographicFactory.getDemographic("male", "BC");
        Product products = ProductFactory.createProduct(4500, 2, "Sunnies");
        OrderItem orderitems;
        orderitems = OrderItemFactory.createOrderItem("Ocley", 3, "Sunnies", (List<Product>) products);
        
        Customer customer = CustomerFactory.createCustomer(name, address, contact, demo, (List<OrderItem>)orderitems);
             repository.save(customer);
             id = customer.getId();
        Assert.assertNotNull(customer);
    }
    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Customer customer = repository.findOne(id);
        Assert.assertNotNull(customer);
    }
 @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }
     /*@Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Customer customer = repository.findOne(id);
        repository.delete(customer);
        Customer deletedcustomer = repository.findOne(id);
        Assert.assertNull(deletedcustomer);
    }*/
    }   

               
        