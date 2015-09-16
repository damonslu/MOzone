/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DAMONSLU
 */
@Entity
public class Gym implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
   @Embedded
    private Address address;
   @Embedded
   private Contact contact;
    
       
      public Gym(Builder builder) {
        this.name=builder.name;
        this.id=builder.id;
        this.address=builder.address;
        this.contact=builder.contact;

    }
       public Gym(){
           
       }

 public static class Builder{
           private Long id;
           private String name;
           private Address address;
           private Contact contact;
           
        public Builder(Long id) {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        public Builder(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Builder setCompName(String name){
               this.name = name;
               return this;
           }
                             
        public Builder address(Address value){
            this.address=value;
            return this;
        }

       public Gym build(){
               return new Gym(this);
           }

        public Object contact(Contact contact) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       }
    
       public Long getId(){
           return id;
       }
    
    public String getCompName() {
        return name;
    }
public Address getAddress(){
           return address;
       }
public Contact getContact(){
           return contact;
       }
        
       public Collection<Product> getItems(Collection<Product> products){
        
        return products;
    }

public Gym copy(Gym value){
               //this.description = value.description;
               this.id = value.id;
                this.name = value.name;
                this.address = value.address;
                this.contact = value.contact;
                this.products=value.products;

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
        if (!(object instanceof Gym)) {
            return false;
        }
        Gym other = (Gym) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    
}
