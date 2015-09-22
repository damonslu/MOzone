/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import ozone.domain.Name;

/**
 *
 * @author admin
 */
public class NameFactory {
    
    public static Name createName(String firstName, String lastName){
            
        Name name = new Name
                .Builder(firstName)
                .lastName(lastName)
                .build();
    
               return name;
    }
}
