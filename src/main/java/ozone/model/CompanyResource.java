package ozone.model;

import ozone.domain.Product;
import org.springframework.hateoas.ResourceSupport;


import java.util.List;
import ozone.domain.Address;
import ozone.domain.Contact;

/**
 * Created by hashcode on 2015/05/12.
 */
public class CompanyResource extends ResourceSupport{

    // Changed from id because of id in ResourceSupport
    private Long resid;
    private String compName;

    private Address address;
    private Contact contact;

    private List<Product> products;

    private CompanyResource() {
    }

    public Long getResid() {
        return resid;
    }

    public String getCompName() {
        return compName;
    }

    public Address getAddress() {
        return address;
    }
    public Contact getContact() {
        return contact;
    }

    public List<Product> getProducts() {
        return products;
    }

    public CompanyResource(Builder builder) {
        this.address=builder.address;
        this.products=builder.products;
        this.contact=builder.contact;
        this.compName=builder.compName;
                this.resid=builder.resid;

    }

    public static class Builder{
        private Long resid;
        private String compName;
        private Address address;
        private Contact contact;
        private List<Product> products;

        public Builder(String compName) {
            this.compName = compName;
        }

        public Builder resid(Long value){
            this.resid=value;
            return this;
        }


        public Builder address(Address value){
            this.address=value;
            return this;
        }
        public Builder contact(Contact value){
            this.contact=value;
            return this;
        }

        public Builder product(List<Product> value){
            this.products=value;
            return this;
        }

        public Builder copy(CompanyResource value){
            this.address=value.address;
            this.contact=value.contact;
            this.products = value.products;
            this.resid=value.resid;
            this.compName=value.compName;
            return this;
        }

        public CompanyResource build(){
            return new CompanyResource(this);
        }

    }





}
