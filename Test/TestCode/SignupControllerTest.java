/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foody;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
public class SignupControllerTest {
    
    public SignupControllerTest() {
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
     * Test of isValid method, of class SignupController.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String iemail = "";
        boolean expResult = false;
        boolean result = SignupController.isValid(iemail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginScreen method, of class SignupController.
     */
    @Test
    public void testLoginScreen() throws Exception {
        System.out.println("loginScreen");
        ActionEvent event = null;
        SignupController instance = new SignupController();
        instance.loginScreen(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class SignupController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        SignupController instance = new SignupController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Signup method, of class SignupController.
     */
    @Test
    public void testSignup() {
        System.out.println("Signup");
        ActionEvent event = null;
        SignupController instance = new SignupController();
        instance.Signup(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoBox method, of class SignupController.
     */
    @Test
    public void testInfoBox() {
        System.out.println("infoBox");
        String infoMessage = "";
        String headerText = "";
        String title = "";
        SignupController.infoBox(infoMessage, headerText, title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
