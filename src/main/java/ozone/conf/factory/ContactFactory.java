/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import ozone.domain.Contact;

/**
 *
 * @author admin
 */
public class ContactFactory {
    
    public static Contact createContact(String phoneNumber,String cellNumber, String email){

        Contact contact = new Contact
                .Builder(phoneNumber)
                .cellNumber(cellNumber)
                .email(email)
                .build();
        return contact;
    }
}
