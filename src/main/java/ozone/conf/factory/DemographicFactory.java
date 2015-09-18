/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.conf.factory;

import ozone.domain.Demographic;

/**
 *
 * @author boniface
 */
public class DemographicFactory {
    
    public static Demographic getDemographic(String gender, String race){
        Demographic demo = new Demographic();
        demo.setGender(gender);
        demo.setRace(race);
        
        return demo;
        
    }
    
}
