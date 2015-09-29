package ozone.service;

import ozone.conf.factory.ContactFactory;
import ozone.conf.factory.ProductFactory;
import ozone.conf.factory.CompanyFactory;
import ozone.domain.Product;
import ozone.domain.Company;
import ozone.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import ozone.App;
import ozone.conf.factory.AddressFactory;
import ozone.domain.Address;
import ozone.domain.Contact;

/**
 * Created by Lucrecia
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CompanyServiceTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private CompanyCrudService service;

    private Long id;

    @Autowired
    private CompanyRepository repository;
    private List<Product> products;
//    @BeforeMethod
    public void setUp() throws Exception {
        products = new ArrayList<>();

    }
//    @Test
    public void create() throws Exception {

        Address co_add = AddressFactory
                .createAddress("7998", "67 Keizer Ave", "67 POBox");
        Contact co_con = ContactFactory
                .createContact("85757555","74747464","prod@test.com");
        Product co_prod1 = ProductFactory
                .createProduct(900, 8, "Fashion Eyewear");
        Product co_prod2 = ProductFactory
                .createProduct(300, 2, "Diesel");

        products.add(co_prod1);
        products.add(co_prod2);

        Company company = CompanyFactory
                    .createCompany("ICMe", co_add, co_con, products);
        repository.save(company);
        id=company.getId();
        Assert.assertNotNull(company.getId());
    }


//    @Test
    public void testGetCompanyProduct() throws Exception {
        List<Product> co_prods = service.getProducts();
        Assert.assertTrue(products.size() == 2);

    }
}
