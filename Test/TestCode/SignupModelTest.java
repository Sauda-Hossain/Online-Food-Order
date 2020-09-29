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
public class SignupModelTest {
    
    public SignupModelTest() {
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
     * Test of isDbConnected method, of class SignupModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        SignupModel instance = new SignupModel();
        boolean expResult = false;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSignup method, of class SignupModel.
     */
    @Test
    public void testIsSignup() throws Exception {
        System.out.println("isSignup");
        String fname = "";
        String lname = "";
        String email = "";
        String password = "";
        String phone = "";
        String state = "";
        String city = "";
        String landmark = "";
        int pincode = 0;
        SignupModel instance = new SignupModel();
        instance.isSignup(fname, lname, email, password, phone, state, city, landmark, pincode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmail method, of class SignupModel.
     */
    @Test
    public void testIsEmail() throws Exception {
        System.out.println("isEmail");
        String email = "";
        SignupModel instance = new SignupModel();
        boolean expResult = false;
        boolean result = instance.isEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
