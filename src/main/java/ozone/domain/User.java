/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author hashcode
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
    @Column(unique = true)
    private String email;
    @Embedded
    private Contact contact;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //@JoinColumn(name = "user_id")
    //List<Account> accounts;
    //@OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    List<Gym> gyms;
    
    private User() {
    }
    


    private User(Builder builder) {
        id= builder.id;
        firstname = builder.firstname;
        lastname=builder.lastname;
        age = builder.age;
        email = builder.email;
        contact = builder.contact;
        //accounts = builder.accounts;
        gyms = builder.gyms;
       }

    
    public static class Builder {

        private Long id;
        private String firstname;
        private String lastname;
        private int age;
        private String email;
        private Contact contact;
        //List<Account> accounts;
        List<Gym> gyms;

        public Builder(String email) {
            this.email = email;
        }

        public Builder id(Long value) {
            id = value;
            return this;
        }

        public Builder firstname(String value) {
            firstname = value;
            return this;
        }

        public Builder lastnaname(String value) {
            lastname = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder contact(Contact value) {
            contact = value;
            return this;
        }

        /*public Builder accounts(List<Account> value) {
            accounts = value;
            return this;
        }*/

        public Builder gyms(List<Gym> value) {
            gyms = value;
            return this;
        }
        public Builder user(User user){
            id = user.getId();
            firstname = user.getFirstname();
            lastname = user.getLastname();
            age = user.getAge();
            email = user.getEmail();
            gyms = user.getGyms();
            //accounts = user.getAccounts();
            contact = user.getContact();
            return this;
            
        }
        
        public User build(){
            return new User(this);
        }

    }

    /*public List<Account> getAccounts() {
        
        return accounts;
    }*/

    public int getAge() {
        return age;
    }
    

    public List<Gym> getGyms() {
        return gyms;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public Contact getContact() {
        return contact;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kabaso.askweb.domain.User[ id=" + id + " ]";
    }

}
