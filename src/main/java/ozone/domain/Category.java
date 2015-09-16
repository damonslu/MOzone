/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.domain;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author damonslu
 */
@Entity
public class Category implements Serializable{
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String catName;
    private String description;
   
   
    public Category(){
           
       }
       
      private Category(Category.Builder builder) {
        this.catName=builder.catName;
        this.id=builder.id;
        this.description=builder.description;
      }

 public static class Builder{
           private Long id;
           private String catName;
           private String description;

        public Builder(String cat_Name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
           
          public Builder setCatName(String catName){
               this.catName = catName;
               return this;
           }
          public Builder setId(Long id){
               this.id = id;
               return this;
           }
          public Builder setDescription(String  description){
               this.description = description;
               return this;
           }
                           
         public Category build(){
               return new Category(this);
           }
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
public Category copy(Category value){
               //this.description = value.description;
               this.id = value.id;
                this.catName = value.catName;
                this.description = value.description;
                
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
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    
}
