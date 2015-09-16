/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.services.Impl;

import ozone.domain.User;
import ozone.respository.UserRepository;
import ozone.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
}
