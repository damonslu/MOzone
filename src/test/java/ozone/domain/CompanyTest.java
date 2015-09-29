/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.domain;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DAMONSLU
 */
public class CompanyTest {
    
    public CompanyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Company.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Company instance = new Company();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompName method, of class Company.
     */
    @Test
    public void testGetCompName() {
        System.out.println("getCompName");
        Company instance = new Company();
        String expResult = "";
        String result = instance.getCompName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Company.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Company instance = new Company();
        Address expResult = null;
        Address result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class Company.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        Company instance = new Company();
        Contact expResult = null;
        Contact result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class Company.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        
        Company instance = new Company();
       
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class Company.
     */
    @Test
    public void testCopy() {
        System.out.println("copy");
        Company value = null;
        Company instance = new Company();
        Company expResult = null;
        Company result = instance.copy(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Company.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Company instance = new Company();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Company.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Company instance = new Company();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
