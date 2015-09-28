package ozone.repository;

import org.springframework.data.repository.CrudRepository;
import ozone.domain.Customer;

/**
 * Created by hashcode on 2015/05/03.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
