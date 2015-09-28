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
//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double price;
    private Integer quantity;
    private String description;
    
   public Long getId(){
           return id;
       }
       public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public Product(Builder builder){
           id = builder.id;
           price = builder.price;
           quantity = builder.quantity;
           description = builder.description;
        }
       public Product(){
         
       }

       public static class Builder{
           private Long id;;
           private double price;
           private Integer quantity;
           private String description;

        public Builder(double price) {
            this.price=price;
        }
       
       public Builder id(Long id){
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
   }
