package ozone.api;

//import ozone.domain.Product;
//import com.Ozone.domain.Lecturer;
//import ozone.service.ProductCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import ozone.domain.Product;

/**
 * Created by Lucrecia
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    //private ProductCrudService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public Product getProduct(){
        Product product = new Product.Builder(2)
                .setPrice(600).setQuantity(30).setDescription("MarbleTable")
                .build();

        return product;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts(){


      service.getProducts();
    }




}
