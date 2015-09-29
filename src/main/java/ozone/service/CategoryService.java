package ozone.service;


import java.util.List;
import ozone.domain.Category;
import ozone.domain.Product;

/**
 * Created by hashcode on 2015/05/10.
 */
public interface CategoryService {
     List<Category> getAllCategories();
     List<Product> getProducts(Long id);
}
