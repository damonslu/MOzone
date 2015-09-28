/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author damonslu
 */
@Entity
public class Category implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String catName;
    private String description;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="Category_id")
    private List<Product> products;
   
    private Category(){
       
       }
     public Long getId(){
           return id;
       }
    
    public String getCatName() {
        return catName;
    }
public String getDescription(){
           return description;
       }
public List<Product> getProducts() {
        return products;
    }
      
      public Category(Builder builder) {
        this.catName=builder.catName;
        this.id=builder.id;
        this.description=builder.description;
        this.products=builder.products;
      }

 public static class Builder{
           private Long id;
           private String catName;
           private String description;
           private List<Product> products;

       
          public Builder(String catName){
               this.catName = catName;
           }
          public Builder setId(Long id){
               this.id = id;
               return this;
           }
          public Builder setDescription(String  description){
               this.description = description;
               return this;
           }
          public Builder setProduct(List<Product> value){
            this.products=value;
            return this;
                                     
          }
    
      
public Builder copy(Category value){
               //this.description = value.description;
               this.id = value.id;
                this.catName = value.catName;
                this.description = value.description;
                this.products = value.products;
                
                  return this;
}
                  
                   public Category build(){
               return new Category(this);
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
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    
}
