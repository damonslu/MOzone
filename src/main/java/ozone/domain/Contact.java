package ozone.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * Created by hashcode on 2015/04/20.
 */
@Embeddable
public class Contact implements Serializable {
    private String phoneNumber;
    private String cellNumber;
    private String email;

    public Contact() {
    }

    private Contact(Builder builder) {
        phoneNumber=builder.phoneNumber;
        cellNumber=builder.cellNumber;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public String getCell() {
        return cellNumber;
    }
    public String getEmail() {
        return email;
    }


    public static class Builder{
        private String phoneNumber;
        private String cellNumber;
        private String email;


        public Builder(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Builder cellNumber(String value){
            this.cellNumber=value;
            return this;
        }
    public Builder email(String value){
            this.email=value;
            return this;
        }
        public Builder copy(Contact value){
            this.cellNumber=value.cellNumber;
            this.phoneNumber=value.phoneNumber;
            this.email=value.email;

            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }

}
