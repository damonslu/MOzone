/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.domain;

import java.util.List;
import ozone.domain.Address;

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
