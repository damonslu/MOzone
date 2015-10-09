package ozone.api;

import ozone.domain.Product;
import ozone.domain.Category;
import ozone.model.CategoryResource;
import ozone.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;

/**
 * Created by hashcode on 2015/05/10.
 */
@Controller
//@RestController
@RequestMapping(value="/category/**")
public class CategoryPage {
    @Autowired
    private CategoryService service;
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Product> getCategoryProducts(@PathVariable Long id) {


        // ...
        return service.getProducts(id);
    }
//
//    @RequestMapping(value="/{id}/products", method=RequestMethod.GET)
//    List<Product> getCategoryProducts(@PathVariable Long id) {
//        // ...
//    }
//
    @RequestMapping(value="/category", method=RequestMethod.GET)

    public List<CategoryResource> getCategories() {
        List<CategoryResource> hateos = new ArrayList<>();
        List<Category> categories = service.getAllCategories();
        for (Category category : categories) {
            CategoryResource res = new CategoryResource
                    .Builder(category.getCatName())
                    .description(category.getDescription())
                    .product(category.getProducts())
                    .resid(category.getId())
                    .build();
            Link products = new
                    Link("http://localhost:8084/category/"+res.getResid().toString())
                    .withRel("depts");
            res.add(products);
            hateos.add(res);
        }
        return hateos;
    }
}
