/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.conf.factory;

import java.util.List;
import ozone.domain.Category;
import ozone.domain.Product;

/**
 *
 * @author DAMONSLU
 */
 public class CategoryFactory {
    
    private static Category createCategory(String cat_Name,String description, Long id,
            List<Product> products){

        Category category = new Category
                .Builder(cat_Name)
                .setDescription(description)
                .setId(id)
                .setProduct(products)
                .build();
        return category;
    }
}
