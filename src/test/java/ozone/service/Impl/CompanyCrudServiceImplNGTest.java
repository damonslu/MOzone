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
import ozone.service.Impl.CompanyCrudServiceImpl;

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
    public void testFind() {
        System.out.println("find");
        Long id = null;
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        Company expResult = null;
        Company result = instance.find(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class CompanyCrudServiceImpl.
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
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
        return null;
    }

    /**
     * Test of remove method, of class CompanyCrudServiceImpl.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Company entity = null;
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CompanyCrudServiceImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findInRange method, of class CompanyCrudServiceImpl.
     */
    @Test
    public void testFindInRange() {
        System.out.println("findInRange");
        int firstResult = 0;
        int maxResults = 0;
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        List expResult = null;
        List result = instance.findInRange(firstResult, maxResults);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class CompanyCrudServiceImpl.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        long expResult = 0L;
        long result = instance.count();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntitiesByProperName method, of class CompanyCrudServiceImpl.
     */
    @Test
    public void testGetEntitiesByProperName() {
        System.out.println("getEntitiesByProperName");
        String propertyName = "";
        String propertyValue = "";
        CompanyCrudServiceImpl instance = new CompanyCrudServiceImpl();
        List expResult = null;
        List result = instance.getEntitiesByProperName(propertyName, propertyValue);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
