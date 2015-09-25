package ozone.domain;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//import ozone.conf.factory.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Lucrecia
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    /*@Test
    public void testCreateCustomer(){
           Map<String,String> values = new HashMap<String, String>();
           values.put("firstname", "Lucrecia");
           values.put("lastname","Damons");
           Customeraddress address = AddressFactory.getAddress("TEST!", "HOME", "Address 45");
           Map<String,String> contactValues = new HashMap<String, String>();
            contactValues.put("email", "test@test.com");
            contactValues.put("phone", "12345");
            contactValues.put("fax", "1234");
            contactValues.put("cell", "t0983223");
           Contact contact = ContactFactory.getContact(contactValues);
           
           Demographic demo = DemographicFactory.getDemographic("female!", "BlackColoured");

           Customer customer = CustomerFactory.createCustomer(values, address, contactValues, demo);

           Assert.assertEquals("Damons",customer.getName().getLastname());
    }
        
               /* .setFirstname("Lucrecia")
                .
                .copy(value);
        Customeraddress address = new Customeraddress();
        Set<address> caddress = new Set<address>();
        values.put("firstname", "Lucrecia");
        values.put("lastname", "Damons");
        c.
        
        
        //Customer c  = CustomerFactory.();
        //Customer c = CustomerFactory.createCustomer(20,values,address,contact,demo);
               
           

    }
/* Customer newcustomer = new Customer
                .Builder(c.getName())
                .copy(c)
                .address(null)offering(20).build();*/

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
