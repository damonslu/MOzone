/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Lucrecia
 */
@Embeddable
public class Demographic implements Serializable{
    private String gender;
    private String race;

    public String getGender() {
        return gender;
    }
    public String getRace() {
        return race;
    }
    public Demographic(){
        
    }
private Demographic(Builder builder) {
        gender=builder.gender;
        race=builder.race;
    }
     
    public static class Builder{
        private String gender;
        private String race;
        
        public Builder(String gender) {
            this.gender = gender;
        }

        public Builder race(String value){
            this.race=value;
            return this;
        }
   
        public Builder copy(Demographic value){
            this.race=value.race;
            this.gender=value.gender;

            return this;
        }

        public Demographic build(){
            return new Demographic(this);
        }
    }
}
