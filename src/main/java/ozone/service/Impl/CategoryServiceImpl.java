/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ozone.domain.Category;
import ozone.domain.Product;
import ozone.service.CategoryService;
import ozone.repository.CategoryRepository;

/**
 *
 * @author DAMONSLU
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
     CategoryRepository repository;
        public List<Category> getAllCategory() {
        List<Category> categories = new ArrayList<>();
        Iterable<Category> values = repository.findAll();
        for (Category value : values) {
            categories.add(value);
        }
        return categories;
        }
    @Override
    public List<Category> getAllCategories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProducts(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       }
       

