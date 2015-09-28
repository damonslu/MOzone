package ozone.repository;

import org.springframework.data.repository.CrudRepository;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/04/13.
 */
public interface ProductRepository extends CrudRepository<Product,Long>{
    public Product findByPrice(double price);

}