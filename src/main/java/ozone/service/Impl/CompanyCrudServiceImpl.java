package ozone.service.Impl;

import ozone.domain.Company;
import ozone.repository.CompanyRepository;
import ozone.service.CompanyCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import ozone.domain.Customer;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/05/10.
 */
@Service
public class CompanyCrudServiceImpl implements CompanyCrudService{
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

    @Override
    public Company find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persist(Company entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(Company entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Company entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> findInRange(int firstResult, int maxResults) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> getEntitiesByProperName(String propertyName, String propertyValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
