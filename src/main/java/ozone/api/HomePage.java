package ozone.api;

//import com.Ozone.domain.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import ozone.domain.Customer;
import ozone.domain.Company;
import ozone.service.CompanyCrudService;

/**
 * Created by Lucrecia
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private CompanyCrudService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "/company",method = RequestMethod.GET)
    public Company getCompany(){
        Company company = new Company.Builder("MZONE")
                .address(null)
                .contact(null)
                .products(null)
                .build();
              
        return company;
    }

    @RequestMapping(value = "/Customers", method = RequestMethod.GET)
    public List<Customer> getCustomer(){


     //service.class(); 
        service.getEntitiesByProperName(null, null); 
        return null;
    }




}
