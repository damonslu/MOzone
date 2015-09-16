/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service.Impl;

import ozone.domain.User;
import ozone.service.UserService;
import ozone.service.Service;
import java.util.List;
import ozone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author hashcode
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User find(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User persist(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public User merge(User entity) {
        if (entity.getId()!=null) {
            return userRepository.save(entity);
        }
        return null;
        }

    @Override
    public void remove(User entity) {
    
        userRepository.delete(entity);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void persist(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findInRange(int firstResult, int maxResults) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getEntitiesByProperName(String propertyName, String propertyValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persist(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(User entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
