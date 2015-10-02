package ozone.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ozone.App;
import ozone.domain.Address;
import ozone.domain.Company;
import ozone.domain.Contact;
 /**
 * damonslu
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CompanyCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;
    @Autowired
    private CompanyRepository repository;
    @Test
    public void Create() throws Exception {
        
        Address address = new Address.Builder("9807")
                .physicalAddress("14 Bleomhof")
                .postalAddress("POBOX 60")
                .build();
        
        Contact contact = new Contact.Builder("04155444")
                .cellNumber("14 5566876")
                .email("test@test.com")
                .build();
        Company company = new Company.Builder("Dischem")
                .address(address)
                .contact(contact)
                .build();
              
        repository.save(company);
        Assert.assertNotNull(company);
    }
    
        @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Company company = repository.findOne(id);
        Assert.assertNotNull(company);
    }
     /*   @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }
          @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Company company = repository.findOne(id);
        repository.delete(company);
        Company deletedcompany = repository.findOne(id);
        Assert.assertNull(deletedcompany);*/
      /*  company = repository.findOne(company.getId());
        Assert.assertEquals("Dischem", company.getCompName());


        Company newcompany = new Company.Builder("81111").setId(company.getId())
                .address(address)
                .contact(contact)
                .build();
        repository.save(newcompany);
        Assert.assertEquals("81111", company.getId());
        Assert.assertEquals("14 Bloemhof", address.getPAddress());

       company = repository.findOne(company.getId());
        repository.delete(company);
        newcompany = repository.findOne(company.getId());
        Assert.assertNull(newcompany);
    }*/


}
