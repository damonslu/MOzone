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
                 .Builder(name)
                .address(address)
                .contact(contact)
                .demo(demo)
                .orderitems(orderitems)
                .build();
        return customer;
        
    }
    
}
