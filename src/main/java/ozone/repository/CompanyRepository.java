package ozone.repository;

import ozone.domain.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hashcode on 2015/04/13.
 */
public interface CompanyRepository extends CrudRepository<Company,Long>{
    public Company findByCode(String name);

}
