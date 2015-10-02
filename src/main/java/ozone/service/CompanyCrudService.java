/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.service;

import java.util.List;
import ozone.domain.Company;
import ozone.domain.Product;

/**
 *
 * @author administrator
 */
public interface CompanyCrudService {
    
     List<Company> getCompanies();
     List<Product> getProducts();
}
    
