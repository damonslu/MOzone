package ozone.service;

import ozone.domain.Customer;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface CustomerService {
    List<Customer> getCustomers();

    //public int getNumber(Department it);
    
}