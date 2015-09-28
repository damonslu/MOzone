/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import java.util.List;
import ozone.domain.Address;
import ozone.domain.Company;
import ozone.domain.Contact;
import ozone.domain.Product;

/**
 *
 * @author DAMONSLU
 */
public class CompanyFactory {
    public static Company createCompany(String compName, Address address, Contact contact,
            List<Product> products)
                                              
                                             {
        Company company = new Company
                .Builder(compName)
                .address(address)
                .contact(contact)
                .products(products)
                   .build();

        return company;
    }
    
}
