/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Lucrecia
 */
@Entity
public class OrderItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemname;
    private Integer itemquantity;  
    private String description;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="Order_id")
    private List<Product> products;
    
   public List<Product> getProduct(){
        return products;
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
public String getDescription() {
        return description;
    }
public OrderItem(){
}
    
    private OrderItem(Builder builder){
    
        id = builder.id;
        itemname = builder.itemname;
        itemquantity = builder.itemquantity;
        description= builder.description;
        products= builder.products;
    } 
        
    public static class Builder{
    private Long id;
    private String itemname;
    private Integer itemquantity;
    private String description;
    private List<Product> products;
    
    public Builder setId(Long id){
        this.id = id;
        return this;
    }
    public Builder(String itemname){
        this.itemname = itemname;
    }
    public Builder setQauntity(Integer itemquantity){
        this.itemquantity = itemquantity;
        return this;
    }
     
    public Builder setDescription(String description){
        this.description = description;
        return this;
    }
    public Builder setProducts(List<Product> products){
        this.products = products;
        return this;
    }
      public OrderItem build(){
          return new OrderItem(this);
      }
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
