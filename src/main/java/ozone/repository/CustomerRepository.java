package ozone.repository;

import ozone.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hashcode on 2015/05/03.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
