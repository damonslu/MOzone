package ozone.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 * Created by hashcode on 2015/04/20.
 */
@Embeddable
public class Name implements Serializable {
    private String firstName;
    private String lastName;

    public Name() {
    }

    private Name(Builder builder) {
        firstName=builder.firstName;
        lastName=builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }
public String getLastName() {
        return lastName;
    }

   
    public static class Builder{
        private String firstName;
        private String lastName;
        
        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder lastName(String value){
            this.lastName=value;
            return this;
        }
   
        public Builder copy(Name value){
            this.lastName=value.lastName;
            this.firstName=value.firstName;

            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }

}
