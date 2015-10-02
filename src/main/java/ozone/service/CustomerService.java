package ozone.service;

import ozone.domain.Customer;
import java.util.List;
import ozone.domain.OrderItem;
import ozone.domain.Product;

/**
 *
 * @author Administrator
 */
public interface CustomerService {
    /**
     *
     * @return
     */
    public List<Customer> getCustomers();
        public List<Product> getProducts();
            public List<OrderItem> getOrderItems();


    
    //public int getNumber(Department it);
    
}