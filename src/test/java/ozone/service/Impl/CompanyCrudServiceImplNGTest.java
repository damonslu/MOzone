/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service.Impl;

import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ozone.domain.Company;

/**
 *
 * @author DAMONSLU
 */
public class CompanyCrudServiceImplNGTest {
    
    public CompanyCrudServiceImplNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of find method, of class CompanyCrudServiceImpl.
     */
    
    @Test
    public void testPersist() {
        System.out.println("persist");
        Company entity = null;
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        Company expResult = null;
        //Company result = instance.persist(entity);
        //assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class CompanyCrudServiceImpl.
     * @return 
     */
    @Test
    public Company testMerge() {
        System.out.println("merge");
        Company entity = null;
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        Company expResult = null;
        String result;
        //result = instance.merge(entity);
        //assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        return null;
    }

    /**
     * Test of remove method, of class CompanyCrudServiceImpl.
     */
       
}
