package ozone.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import ozone.domain.*;

/**
 * 
 */
@Entity
public class Customer  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //private String name;
    @Embedded
    private Name name;
    @Embedded
    private Contact contact;
    @Embedded
    private Address address;
    @Embedded
    private Demographic demo;
    @OneToMany
    @JoinColumn(name = "cust_id")
    private List<OrderItem> orderitems;

    public Customer(Name name, 
            Address address, 
            Contact contact, 
            Demographic demo,
            List<OrderItem> orderitems) {
 
    }
    public Customer(){
    }

        public Long getId() {
        return id;
    }

        public Name getName(){
        return name;
    }

    public Address getAddress() {
        return address;
    }
    public Contact getContact(){
        return contact;
    }
    public Demographic getDemographic(){
        return demo;
    }

    public List<OrderItem> getOrderItems() {
        return orderitems;
    }

    public Customer(Builder builder) {
        this.address=builder.address;
        this.id=builder.id;
        this.name = builder.name;
        this.contact = builder.contact;
        this.demo = builder.demo;
        this.orderitems=builder.orderitems;
        //this.name=builder.name;
    }

    public static class Builder{
        private Long id;
        //private String name;
        private Name name;
        private Address address;
        private Contact contact;
        private Demographic demo;
        private List<OrderItem> orderitems;

       
        public Builder getId(Long id){
            this.id=id;
            return this;
        }
        public Builder getName(Name name){
            this.name=name;
            return this;
        }
        public Builder getAddress(Address address){
            this.address=address;
            return this;
        }
        public Builder getContact(Contact contact){
            this.contact=contact;
            return this;
        }
        public Builder getDemo(Demographic demo){
            this.demo=demo;
            return this;
        }
        public Builder getOrderitems(List<OrderItem> orderitems){
            this.orderitems = orderitems;
            return this;
        }
        
        public Builder copy(Customer value){
            //this.orderitems=value.orderitems;
            this.address=value.address;
            this.contact = value.contact;
            this.demo = value.demo;
            this.id=value.id;
            this.name=value.name;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }
}
