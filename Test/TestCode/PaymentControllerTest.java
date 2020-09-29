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
public class PaymentControllerTest {
    
    public PaymentControllerTest() {
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
     * Test of initialize method, of class PaymentController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        PaymentController instance = new PaymentController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class PaymentController.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        PaymentController instance = new PaymentController();
        instance.calculate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConfirmedScreen method, of class PaymentController.
     */
    @Test
    public void testConfirmedScreen() throws Exception {
        System.out.println("ConfirmedScreen");
        ActionEvent event = null;
        PaymentController instance = new PaymentController();
        instance.ConfirmedScreen(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cashOnDelivery method, of class PaymentController.
     */
    @Test
    public void testCashOnDelivery() {
        System.out.println("cashOnDelivery");
        ActionEvent event = null;
        PaymentController instance = new PaymentController();
        instance.cashOnDelivery(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onlinePayment method, of class PaymentController.
     */
    @Test
    public void testOnlinePayment() {
        System.out.println("onlinePayment");
        ActionEvent event = null;
        PaymentController instance = new PaymentController();
        instance.onlinePayment(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmPayment method, of class PaymentController.
     */
    @Test
    public void testConfirmPayment() {
        System.out.println("confirmPayment");
        ActionEvent event = null;
        PaymentController instance = new PaymentController();
        instance.confirmPayment(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoBox method, of class PaymentController.
     */
    @Test
    public void testInfoBox() {
        System.out.println("infoBox");
        String infoMessage = "";
        String headerText = "";
        String title = "";
        boolean expResult = false;
        boolean result = PaymentController.infoBox(infoMessage, headerText, title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoBox1 method, of class PaymentController.
     */
    @Test
    public void testInfoBox1() {
        System.out.println("infoBox1");
        String infoMessage = "";
        String headerText = "";
        String title = "";
        PaymentController.infoBox1(infoMessage, headerText, title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Logout method, of class PaymentController.
     */
    @Test
    public void testLogout() {
        System.out.println("Logout");
        ActionEvent event = null;
        PaymentController instance = new PaymentController();
        instance.Logout(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
