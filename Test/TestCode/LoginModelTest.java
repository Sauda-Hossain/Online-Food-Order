/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foody;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanji
 */
public class LoginModelTest {
    
    public LoginModelTest() {
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
     * Test of isDbConnected method, of class LoginModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        LoginModel instance = new LoginModel();
        boolean expResult = false;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLogin method, of class LoginModel.
     */
    @Test
    public void testIsLogin() throws Exception {
        System.out.println("isLogin");
        String email = "";
        String pass = "";
        LoginModel instance = new LoginModel();
        boolean expResult = false;
        boolean result = instance.isLogin(email, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
