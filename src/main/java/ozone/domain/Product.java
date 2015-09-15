/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.OneToMany;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */

@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double price;
    private Integer quantity;
    private String description;
       //private String productID;
       
       private Product(Builder builder){
           id = builder.id;
           price = builder.price;
           quantity = builder.quantity;
           description = builder.description;
        }
       public Product(){
           
       }

    public void setDetails() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
       public static class Builder{
           private Long id;;
           private double price;
           private Integer quantity;
           private String description;

        public Builder(Long id) {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        public Builder(double price) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        public Builder setId(Long id){
               this.id = id;
               return this;
           }
           
           public Builder setDescription(String description){
               this.description = description;
               return this;
           }
           public Builder setPrice(double price){
               this.price = price;
               return this;
           }
           public Builder setQuantity(Integer quantity){
               this.quantity = quantity;
               return this;
           }
           public Builder copy(Product value){
               //this.description = value.description;
               this.id = value.id;
               this.price = value.price;
               this.quantity  = value.quantity;
               this.description = value.description;
               return this;
           }
           public Product build(){
               return new Product(this);
           }
       }
    @Id
       public Long getId(){
           return id;
       }
    private Collection<OrderItem> items;
    //private String productname;
    //@Basic(optional = false)
    //@NotNull
    //@Column(name = "PRODUCTPRICE")
    //private double productprice;

    

    /*public Productdetails(String productname, double productprice) {
        this.productname = productname;
        this.productprice = productprice;
    }*/

    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public Integer getQuantity() {
        return quantity;
    }

    
    @OneToMany(mappedBy = "productDetails")
        public Collection<OrderItem> getItem(){
        return items;
    }
    public void setProducts(Collection<OrderItem> items){
        
        this.items = items;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
    
}
