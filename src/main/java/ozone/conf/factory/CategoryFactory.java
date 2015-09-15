/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import ozone.domain.Category;

/**
 *
 * @author DAMONSLU
 */
 public class CategoryFactory {
    
    private static Category createCategory(String cat_Name,String description, Long id){

        Category category = new Category
                .Builder(cat_Name)
                .setDescription(description)
                .setId(id)
                .build();
        return category;
    }
}
