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
import org.springframework.transaction.annotation.Transactional;
import ozone.domain.Category;
import ozone.domain.Product;
import ozone.service.CategoryService;
import ozone.repository.CategoryRepository;

/**
 *
 * @author DAMONSLU
 */
@Service("CategoryService")
//@Transactional
public abstract class CategoryServiceImpl implements CategoryService{
    
    @Autowired
     CategoryRepository repository;
    
    /**
     *
     * @return
     */
    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        Iterable<Category> values = repository.findAll();
        for (Category value : values) {
            categories.add(value);
        }
        return categories;
        }
    
    @Override
    public List<Product> getProducts(Long id) {
return repository.findOne(id).getProducts();
    }
}