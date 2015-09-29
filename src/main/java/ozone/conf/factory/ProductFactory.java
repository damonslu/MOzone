/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.conf.factory;

import ozone.domain.Product;
/**
 *
 * @author boniface
 */
public class ProductFactory {
   
    public static Product createProduct(double price,Integer quantity, String description){
        
        Product product = new Product
        //.Builder.id(value)
                //.id(value.get(id))
             .Builder(price)
                .setQuantity(quantity)
                .setDescription(description)
                .build();
        return product;
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
