/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ozone.domain.Company;
//import za.ac.cput.company.repository.GenericDAO;
import ozone.service.CompanyCrudService;

/**
 *
 * @author administrator
 */
@Service("companyCrudService")
@Transactional
public class CompanyCrudServiceImpl implements CompanyCrudService {

    /*@Autowired
    private GenericDAO<Company> dao;

    public final void setDao(final GenericDAO<Company> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Company.class);
    }

        public Company findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }*/

    @Override
    public List<Company> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void persist(Company entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Company entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Company entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        public void removeById(Long entityId) {
        setDao(dao);
        dao.removeById(entityId);
    }

    @Override
    public List<Company> findInRange(int firstResult, int maxResults) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        public Company getByCompanyName(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        public List<Company> getEntitiesCompanyName(String name, String value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Company find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> getEntitiesByProperName(String propertyName, String propertyValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
