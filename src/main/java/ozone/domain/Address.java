package ozone.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * Created by hashcode on 2015/04/20.
 */
@Embeddable
 public class Address implements Serializable{
    private String postalCode;
    private String physicalAddress;
    private String postalAddress;
   
    public Address(){
        
    }
   
    private Address(Builder builder) {
        postalCode=builder.postalCode;
        physicalAddress=builder.physicalAddress;
        postalAddress=builder.postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public String getPAddress() {
        return physicalAddress;
    }
    public String getPOaddress(){
        return postalAddress;
    }

    public static class Builder{
        private String postalCode;
        private String physicalAddress;
        private String postalAddress;

        public Builder(String postalCode) {
            this.postalCode = postalCode;
        }

        public Builder physicalAddress(String value){
            this.physicalAddress=value;
            return this;
        }
        public Builder postalAddress(String value){
            this.postalAddress=value;
            return this;
        }
      public Builder copy(Address value){
            this.postalCode=value.postalCode;
            this.physicalAddress=value.physicalAddress;
            this.postalAddress=value.postalAddress;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }

}
