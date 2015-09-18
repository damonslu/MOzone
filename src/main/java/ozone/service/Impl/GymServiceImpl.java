/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service.Impl;
import ozone.domain.Gym;
import ozone.domain.User;
import ozone.repository.GymRepository;
import ozone.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hashcode on 2015/05/10.
 */
@Service
public class GymServiceImpl implements GymService{
    @Autowired
    private GymRepository repository;
    @Override
    public List<Gym> getAllGyms() {
        List<Gym> gym = new ArrayList<>();
        Iterable<Gym> values = repository.findAll();
        for (Gym value : values) {
            gym.add(value);
        }
        return gym;
    }

    @Override
    public List<User> getUser(Long id) {

        return repository.findOne(id).getUsers();
    }



}

/**
 *
 * @author DAMONSLU
 */
public class GymServiceImpl {
    
}
