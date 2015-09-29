/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
/**
 *
 * @author DAMONSLU
 */
@Entity
public class Company implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String compName;
   @Embedded
    private Address address;
   @Embedded
   private Contact contact;
   @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="Company_id")
    private List<Product> products;
           
      public Company(Builder builder) {
        this.compName=builder.compName;
        this.id=builder.id;
        this.address=builder.address;
        this.contact=builder.contact;
        this.products=builder.products;

    }
       public Company(){
           
       }
       public Long getId(){
           return id;
       }
    
    public String getCompName() {
        return compName;
    }
public Address getAddress(){
           return address;
       }
public Contact getContact(){
           return contact;
       }
  public  List<Product> getProduct(){
      return products;
  }
 public static class Builder{
           private Long id;
           private String compName;
           private Address address;
           private Contact contact;
           private List<Product> products;
          
           
        public Builder setId(Long id) {
        this.id=id;
        return this;
        }

        public Builder (String compName){
               this.compName = compName;
           }
                             
        public Builder address(Address value){
            this.address=value;
            return this;
        }
        public Builder contact(Contact value){
            this.contact=value;
            return this;
        }
        public Builder products(List<Product> value){
            this.products=value;
            return this;
                                     
          }
              public Company build(){
               return new Company(this);
           }
   }
    
     

public Company copy(Company value){
               //this.description = value.description;
               this.id = value.id;
                this.compName = value.compName;
                this.address = value.address;
                this.contact = value.contact;
                this.products = value.products;

                  return this;
}
           
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    
}
