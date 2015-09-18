/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service;

import java.util.List;
import ozone.domain.Gym;
import ozone.domain.Customer;

/**
 *
 * @author DAMONSLU
 */
public interface GymService {
    
     List<Gym> getAllGyms();
     List<Customer> getCustomer(Long id);

}

    
