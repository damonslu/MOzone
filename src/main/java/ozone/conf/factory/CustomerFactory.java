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
    
    public static Customer createCustomer(Name name, Address address, 
            Contact contact, Demographic demo, List<OrderItem> orderitems){
        
        Customer customer = new Customer
                 .Builder(name.getFirstName())
                .address(address.getPAddress(),address.getPOaddress(), address.getPostalCode())
                .contact(contact.getCell(), contact.getEmail(), contact.getPhone())
                .demo(demo.getGender(),demo.getRace())
                .orderitems(orderitems)
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
