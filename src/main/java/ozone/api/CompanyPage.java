package ozone.api;

import java.util.ArrayList;
import ozone.domain.Company;
import ozone.service.CompanyCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import ozone.domain.Product;
import ozone.model.CompanyResource;

/**
 * Created by hashcode on 2015/04/07.
 */
@Controller
//@RestController
@RequestMapping("/company/**")
public class CompanyPage {
    @Autowired
    private CompanyCrudService service;
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
        public List<Product> getCategoryProducts(@PathVariable Long id) {
            
            return service.getProducts();
    
        }
    public String Index(){
        return "This is a Company Page";
    }

    @RequestMapping(value = "/company",method = RequestMethod.GET)
           
            //Address co_add = AddressFactory.createAddress("7689", "78 KearlStreet", "78 POBOX");
        //Contact co_con = ContactFactory.createAddress("4354545", "454545666", "Info@IView.com");
        //Product co_prod = ProductFactory.createProduct(7899, 5, "EyeWear");
        
        public List<CompanyResource> getCompanies() {
        List<CompanyResource> hateos = new ArrayList<>();
        List<Company> companies = service.getCompanies();
        for (Company company : companies) {
        CompanyResource res = new CompanyResource
                .Builder(company.getCompName())
                .address(company.getAddress())
                .contact(company.getContact())
                .product(company.getProduct())
                .resid(company.getId())
                .build();
                                            
        
        Link products = new
                    Link("http://localhost:8084/company/"+res.getId().toString())
                    .withRel("depts");
            res.add(products);
            hateos.add(res);
        }

        return hateos;
    }

}