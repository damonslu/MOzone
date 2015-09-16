package ozone.repository;

import ozone.App;
import ozone.domain.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;
import ozone.domain.Address;
import ozone.domain.Contact;

/**
 * Created by hashcode on 2015/04/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CompanyCRUDNGTest {


    @Autowired
    CompanyRepository repository;
    @Test
    public void testCreate() throws Exception {
        List<Company> companys = new ArrayList<>();
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
        Assert.assertNotNull(company.getId());

        company = repository.findOne(company.getId());
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
    }


}
