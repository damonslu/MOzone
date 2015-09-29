package ozone.model;

import ozone.domain.Category;
import ozone.domain.Product;
import org.springframework.hateoas.ResourceSupport;


import java.util.List;

/**
 * Created by hashcode on 2015/05/12.
 */
public class CategoryResource extends ResourceSupport{

    // Changed from id because of id in ResourceSupport
    private Long resid;
    private String catName;

    private String description;

    private List<Product> products;

    private CategoryResource() {
    }

    public Long getResid() {
        return resid;
    }

    public String getCatName() {
        return catName;
    }
    public String getDescription() {
        return description;
    }

        public List<Product> getProducts() {
        return products;
    }

    public CategoryResource(Builder builder) {
        this.description=builder.description;
        this.products=builder.products;
        this.resid=builder.resid;
        this.catName=builder.catName;
    }

    public static class Builder{
        private Long resid;
        private String catName;
        private String description;
        private List<Product> products;

        public Builder(String catName) {
            this.catName = catName;
        }

        public Builder resid(Long value){
            this.resid=value;
            return this;
        }


        public Builder description(String value){
            this.description=value;
            return this;
        }

        public Builder product(List<Product> value){
            this.products=value;
            return this;
        }

        public Builder copy(CategoryResource value){
            this.description=value.description;
            this.products = value.products;
            this.resid=value.resid;
            this.catName=value.catName;
            return this;
        }

        public CategoryResource build(){
            return new CategoryResource(this);
        }

    }





}
