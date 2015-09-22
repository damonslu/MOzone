/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import java.util.List;
import ozone.domain.OrderItem;
import ozone.domain.Product;

/**
 *
 * @author DAMONSLU
 */
public class OrderItemFactory {
       
    public static OrderItem createOrderItem(String itemname, Integer itemquantity, String description,
            List<Product> products){
        
        OrderItem orderitem = new OrderItem
        //.Builder.id(value)
                //.id(value.get(id))
             .Builder(itemname)
                .setQauntity(itemquantity)
                .setDescription(description)
                .setProducts(products)
                .build();
        return orderitem;
    }
}
