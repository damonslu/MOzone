package ozone.service.Impl;

import ozone.domain.Company;
import ozone.repository.CompanyRepository;
import ozone.service.CompanyCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/05/10.
 */
@Service
public abstract class CompanyCrudServiceImpl implements CompanyCrudService{
    @Autowired
    private CompanyRepository repository;
    @Override
        public List<Company> getCompanies() {
        List<Company> companies = new ArrayList<>();
        Iterable<Company> values = repository.findAll();
        for (Company value : values) {
            companies.add(value);
        }
        return companies;
    }

        public String getCustomer(Long id) {

        return repository.findOne(id).getCompName();
    }

}
