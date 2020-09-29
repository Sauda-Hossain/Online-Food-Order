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
public class LoginControllerTest {
    
    public LoginControllerTest() {
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
     * Test of exitScreen method, of class LoginController.
     */
    @Test
    public void testExitScreen() {
        System.out.println("exitScreen");
        ActionEvent event = null;
        LoginController instance = new LoginController();
        instance.exitScreen(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MenuScreen method, of class LoginController.
     */
    @Test
    public void testMenuScreen() throws Exception {
        System.out.println("MenuScreen");
        ActionEvent event = null;
        LoginController instance = new LoginController();
        instance.MenuScreen(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class LoginController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        LoginController instance = new LoginController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CustomerId method, of class LoginController.
     */
    @Test
    public void testCustomerId() {
        System.out.println("CustomerId");
        int cusst = 0;
        LoginController.CustomerId(cusst);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class LoginController.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        ActionEvent event = null;
        LoginController instance = new LoginController();
        instance.Login(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoBox method, of class LoginController.
     */
    @Test
    public void testInfoBox() {
        System.out.println("infoBox");
        String infoMessage = "";
        String headerText = "";
        String title = "";
        LoginController.infoBox(infoMessage, headerText, title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
