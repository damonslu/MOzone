package ozone.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Customer  implements Serializable{
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

  
    public Customer(){
    }
      public Long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
    public Contact getContact() {
        return contact;
    }
    public Demographic getDemo() {
        return demo;
    }

    public List<OrderItem> getOrderItem() {
        return orderitems;
    }


    

    public Customer(Builder builder) {
        this.id=builder.id;
        this.name = builder.name;
        this.address=builder.address;
        this.contact = builder.contact;
        this.demo = builder.demo;
        this.orderitems=builder.orderitems;
        //this.name=builder.name;
    }

    public static class Builder{
        private Long id;
        //private String name;
        private Name name; 
        private Address address; // = new Address();
        private Contact contact; // = new Contact();
        private Demographic demo; // = new Demographic();
        private List<OrderItem> orderitems;

        
       public Builder(Name name){
        this.name = name;
    }
    public Builder id(Long value) {
       this.id =value;
       return this;
    }

    public Builder address(Address value) {
        this.address = value;
        return this;
    }
    public Builder contact(Contact value){
        this.contact=value;
        return this;
    }
    public Builder demo(Demographic value){
        this.demo=value;
        return this;
    }

    public Builder orderitems(List<OrderItem> value) {
        this.orderitems=value;
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
