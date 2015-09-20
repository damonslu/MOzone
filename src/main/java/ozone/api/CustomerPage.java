package ozone.api;

import ozone.domain.Customer;
//import ozone.model.CustomerResource;
//import ozone.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import ozone.service.CustomerService;
/**
 * Created by hashcode on 2015/05/10.
 */
@RestController
@RequestMapping(value="/customer/**")
public class CustomerPage {
    @Autowired
    private CustomerService service;

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public List<Customer> getCustomerProducts(@PathVariable Long id) {


        // ...
        return service.getCustomers(); //getProducts(id);
    }
//
//    @RequestMapping(value="/{id}/departments", method=RequestMethod.GET)
//    List<Product> getCustomerProducts(@PathVariable Long id) {
//        // ...
//    }
//
    /*@RequestMapping(value="/faculties", method=RequestMethod.GET)

    public List<CustomerResource> getFaculties() {
        List<CustomerResource> hateos = new ArrayList<>();
        List<Customer> faculties = service.getAllFAculties();
        for (Customer faculty : faculties) {
            CustomerResource res = new CustomerResource
                    .Builder(faculty.getName())
                    .address(faculty.getAddress())
                    .department(faculty.getProducts())
                    .resid(faculty.getId())
                    .build();
            Link departments = new
                    Link("http://localhost:8080/faculty/"+res.getResid().toString())
                    .withRel("depts");
            res.add(departments);
            hateos.add(res);
        }
        return hateos;
    }*/
//

}
