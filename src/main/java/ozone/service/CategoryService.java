package ozone.service;


import java.util.List;
import ozone.domain.Category;
import ozone.domain.Product;


public interface CategoryService {
     List<Category> getAllCategories();
     List<Product> getProducts(Long id);
}
