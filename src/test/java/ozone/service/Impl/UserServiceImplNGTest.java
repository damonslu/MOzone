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
import ozone.domain.User;

/**
 *
 * @author DAMONSLU
 */
public class UserServiceImplNGTest {
    
    public UserServiceImplNGTest() {
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
     * Test of find method, of class UserServiceImpl.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        UserServiceImpl instance = new UserServiceImpl();
        User expResult = null;
        User result = instance.find(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class UserServiceImpl.
     */
    @Test
    public void testPersist() {
        System.out.println("persist");
        User entity = null;
        UserServiceImpl instance = new UserServiceImpl();
        User expResult = null;
        User result = instance.persist(entity);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class UserServiceImpl.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        User entity = null;
        UserServiceImpl instance = new UserServiceImpl();
        User expResult = null;
        User result = instance.merge(entity);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class UserServiceImpl.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        User entity = null;
        UserServiceImpl instance = new UserServiceImpl();
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class UserServiceImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        UserServiceImpl instance = new UserServiceImpl();
        List expResult = null;
        List result = instance.findAll();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findInRange method, of class UserServiceImpl.
     */
    @Test
    public void testFindInRange() {
        System.out.println("findInRange");
        int firstResult = 0;
        int maxResults = 0;
        UserServiceImpl instance = new UserServiceImpl();
        List expResult = null;
        List result = instance.findInRange(firstResult, maxResults);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class UserServiceImpl.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        UserServiceImpl instance = new UserServiceImpl();
        long expResult = 0L;
        long result = instance.count();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntitiesByProperName method, of class UserServiceImpl.
     */
    @Test
    public void testGetEntitiesByProperName() {
        System.out.println("getEntitiesByProperName");
        String propertyName = "";
        String propertyValue = "";
        UserServiceImpl instance = new UserServiceImpl();
        List expResult = null;
        List result = instance.getEntitiesByProperName(propertyName, propertyValue);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
