package ozone.repository;

import org.springframework.data.repository.CrudRepository;
import ozone.domain.Company;

/**
 * Created by hashcode on 2015/04/13.
 */
public interface CompanyRepository extends CrudRepository<Company,Long>{
    

}
