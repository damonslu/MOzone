/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
    private String gymName;
   @Embedded
    private Address address;
   @Embedded
   private Contact contact;
   @OneToOne
   @JoinColumn(name = "user_id")
   private List<User> users;
      
      
      public Gym(Builder builder) {
        this.gymName=builder.gymName;
        this.id=builder.id;
        this.address=builder.address;
        this.contact=builder.contact;
        this.users= builder.users;
      }
      public Gym(){
           
       }
       
 public static class Builder{
           private Long id;
           private String gymName;
           private Address address;
           private Contact contact;
           private List<User> users;
           
       
       public Builder (String gymName){
               this.gymName = gymName;
           }
       public Builder users(List<User> users){
               this.users = users;
               return this;
           }
       public Builder contact(Contact value){
            this.contact=value;
            return this;
        }
                             
        public Builder address(Address value){
            this.address=value;
            return this;
        }

       public Gym build(){
               return new Gym(this);
           }

       }
    
       public Long getId(){
           return id;
       }
    
    public String getGymName() {
        return gymName;
    }
public Address getAddress(){
           return address;
       }
public Contact getContact(){
           return contact;
       }
public List<User> getUsers(List<User> users){
        
        return users;
    }
     
public Gym copy(Gym value){
               //this.description = value.description;
               this.id = value.id;
                this.gymName = value.gymName;
                this.address = value.address;
                this.contact = value.contact;
                this.users=value.users;

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
