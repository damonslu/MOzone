package ozone.conf.factory;

import ozone.domain.Gym;

import ozone.domain.Address;
import ozone.domain.Contact;

/**
 * Created by hashcode on 2015/05/03.
 */
public class GymFactory {

    public static Gym createGym(Address address,
                                Contact contact,
                                 String name){
        Gym gym = new Gym
                .Builder(name)
                .address(address)
                .department(contact)
                .build();
        return gym;
    }
}
