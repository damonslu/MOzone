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
public class Name implements Serializable{
    private String firstname;
    private String lastname;
    
    public Name(String firstname, String lastname){
        
    }
    public Name(){
        
    }
   
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
