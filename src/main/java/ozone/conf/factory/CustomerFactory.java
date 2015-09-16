/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.conf.factory;

import ozone.domain.*;;

import java.util.*;

/**
 *
 * @author boniface
 */
public class CustomerFactory {
    
    public static Customer createCustomer(Long value, Name name, Customeraddress address, 
            Contact contact, Demographic demo){
        
        Customer customer = new Customer
        //.Builder.id(value)
                //.id(value.get(id))
              .Builder(name)
                .address(address)
                .contact(contact)
                .demo(demo)
                             .build();
        return customer;
        /*customer.name(name);
        customer.address(address);
         customer.contact(contact);
        customer.demo(demo);*/
       
        //customer.setColour(values.get("color"));
        //department.setName("name");
        //department.setTheme("theme");
        
        //return customer;
    }
    
}
