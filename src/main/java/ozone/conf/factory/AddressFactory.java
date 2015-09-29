/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import ozone.domain.Address;

/**
 *
 * @author admin
 */
public class AddressFactory {
    
    public static Address createAddress(String postalCode,String physicalAddress, String postalAddress){

        Address address = new Address
                .Builder(postalCode)
                .physicalAddress(physicalAddress)
                .postalAddress(postalAddress)
                .build();
        return address;
    }
}
