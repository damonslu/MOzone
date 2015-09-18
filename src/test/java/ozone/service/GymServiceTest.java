/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edfirstCustomeror.
 */

package ozone.service;
import ozone.App;
import ozone.conf.factory.ContactFactory;
import ozone.conf.factory.CustomerFactory;
import ozone.conf.factory.ContactFactory;

import ozone.conf.factory.GymFactory;
import ozone.domain.Customer;
import ozone.domain.Gym;
import ozone.domain.Contact;
import ozone.repository.GymRepository;
import ozone.repository.AddressRepository;
import ozone.repository.ContactRepository;
import ozone.repository.CustomerRepository;
import ozone.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import ozone.conf.factory.DemographicFactory;
import ozone.domain.Address;
import ozone.domain.AddressFactory;
import ozone.domain.Contact;
import ozone.domain.Demographic;
import ozone.domain.Name;
import ozone.domain.NameFactory;

/**
 * Created by hashcode on 2015/05/12.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class GymServiceTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private GymService service;

    private Long id;

    @Autowired
    private GymRepository repository;
    private List<Customer> customers;
    @BeforeMethod
    public void setUp() throws Exception {
        customers = new ArrayList<>();

    }
    @Test
    public void create() throws Exception {
        Name custName = NameFactory.createName("Loance", "Bok");
        Contact contact = ContactFactory.createAddress(null, null, "09688554");
        Address address = AddressFactory.createAddress("7980", null, null);
        Demographic demo = DemographicFactory.getDemographic(null, null);
        Customer firstCustomer = CustomerFactory
                .createCustomer(custName, null, null, null, null); //, null);
        
        Gym newGym = GymFactory.createGym("Vex", address, contact, null);
       
        customers.add(firstCustomer);
          gym .add(newGym);
        Gym gym;
        gym = GymFactory
                .createGym("Vex",address, contact, List<Customer> customers);

        repository.save(gym);
        id=gym.getId();
        Assert.assertNotNull(gym.getId());
    }


    @Test
    public void testGetGymCLient() throws Exception {
        List<Customer> customers = service.getCustomers(id);
        Assert.assertTrue(customers.size() == 2);

    }
}
