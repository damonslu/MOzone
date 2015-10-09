package ozone.service.Impl;

import ozone.domain.Product;
import ozone.repository.ProductRepository;
import ozone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hashcode on 2015/05/10.
 */
@Service
public abstract class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository;
        public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        Iterable<Product> values = repository.findAll();
        for (Product value : values) {
            products.add(value);
        }
        return products;
    }

}
