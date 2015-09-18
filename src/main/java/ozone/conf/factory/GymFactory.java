package ozone.conf.factory;

import java.util.List;
import ozone.domain.Gym;

import ozone.domain.Address;
import ozone.domain.Contact;
import ozone.domain.Customer;

/**
 * Created by hashcode on 2015/05/03.
 */
public class GymFactory {

    public static Gym createGym(String name, Address address,
                                Contact contact, List<Customer> customer)
                                 {
        Gym gym = new Gym
                .Builder(name)
                .address(address)
                .contact(contact)
                .customer(customer)
                .build();
        return gym;
    }
}
