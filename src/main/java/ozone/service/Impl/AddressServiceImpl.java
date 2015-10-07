/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service.Impl;

import ozone.domain.Address;
import ozone.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author damonslu
 */
public class  AddressServiceImpl  implements  AddressService{

    @Autowired
    private Address address;
    

}
