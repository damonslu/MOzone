/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 *
 * @author admin
 */
//GitTest
//@Configuration
//@ComponentScan
//EnableWebMvc
@EnableAutoConfiguration
public class App {
    
    public static void main(String[] args){
        
        System.out.println("Hello World");
        SpringApplication.run(App.class, args);
    }
    
}
