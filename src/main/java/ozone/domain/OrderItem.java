/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lucrecia
 */
@Entity
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemname;
    private Integer itemquantity;
    
    private OrderItem(Builder builder){
    
        id = builder.id;
        itemname = builder.itemname;
        itemquantity = builder.itemquantity;
    } 
        public OrderItem(){
            
        }
    public static class Builder{
    private Long id;
    private String itemname;
    private Integer itemquantity;
    
    public Builder setId(Long id){
        this.id = id;
        return this;
    }
    public Builder setName(String itemname){
        this.itemname = itemname;
        return this;
    }
    public Builder setQauntity(Integer itemquantity){
        this.itemquantity = itemquantity;
        return this;
    }
      public OrderItem build(){
          return new OrderItem(this);
      }
    }   
        @ManyToOne
    private Category category;
    public Category getCategory(){
        return category;
    }
    @ManyToOne
    private Product productdetails;
    public Product getProduct(){
        return productdetails;
    }

     public Long getId(){
         return id;
     } 

    public String getItemname() {
        return itemname;
    }
    public int getItemquantity() {
        return itemquantity;
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
        if (!(object instanceof OrderItem)) {
            return false;
        }
        OrderItem other = (OrderItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ozone.domain.Orderitem[ id=" + id + " ]";
    }
    
}
