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
public class PaymentModelTest {
    
    public PaymentModelTest() {
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
     * Test of isDbConnected method, of class PaymentModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        PaymentModel instance = new PaymentModel();
        boolean expResult = false;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPaymentOnline method, of class PaymentModel.
     */
    @Test
    public void testIsPaymentOnline() throws Exception {
        System.out.println("isPaymentOnline");
        PaymentModel instance = new PaymentModel();
        boolean expResult = false;
        boolean result = instance.isPaymentOnline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update_payment_status_to_confirmed method, of class PaymentModel.
     */
    @Test
    public void testUpdate_payment_status_to_confirmed() throws Exception {
        System.out.println("update_payment_status_to_confirmed");
        PaymentModel instance = new PaymentModel();
        instance.update_payment_status_to_confirmed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert_payment_details method, of class PaymentModel.
     */
    @Test
    public void testInsert_payment_details() throws Exception {
        System.out.println("insert_payment_details");
        String cardnumber = "";
        String cardholdername = "";
        int cvv = 0;
        int month = 0;
        int year = 0;
        PaymentModel instance = new PaymentModel();
        instance.insert_payment_details(cardnumber, cardholdername, cvv, month, year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update_status_to_payment_confirmed method, of class PaymentModel.
     */
    @Test
    public void testUpdate_status_to_payment_confirmed() {
        System.out.println("update_status_to_payment_confirmed");
        PaymentModel instance = new PaymentModel();
        instance.update_status_to_payment_confirmed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
