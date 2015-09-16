/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service;

import java.util.List;
import ozone.domain.Product;

/**
 *
 * @author DAMONSLU
 */
public interface ProductService {
    List<Product> getProducts();
    
}
