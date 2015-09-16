package ozone.repository;

import ozone.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hashcode on 2015/04/13.
 */
public interface ProductRepository extends CrudRepository<Product,Long>{
    public Product findByPrice(double price);

}