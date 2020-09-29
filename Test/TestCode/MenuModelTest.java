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
public class MenuModelTest {
    
    public MenuModelTest() {
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
     * Test of isDbConnected method, of class MenuModel.
     */
    @Test
    public void testIsDbConnected() {
        System.out.println("isDbConnected");
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.isDbConnected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_if_added_to_cart method, of class MenuModel.
     */
    @Test
    public void testCheck_if_added_to_cart() throws Exception {
        System.out.println("check_if_added_to_cart");
        int menuId = 0;
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.check_if_added_to_cart(menuId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cart_add method, of class MenuModel.
     */
    @Test
    public void testCart_add() throws Exception {
        System.out.println("cart_add");
        int menuId = 0;
        MenuModel instance = new MenuModel();
        instance.cart_add(menuId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increment_qnt method, of class MenuModel.
     */
    @Test
    public void testIncrement_qnt() throws Exception {
        System.out.println("increment_qnt");
        int menuId = 0;
        MenuModel instance = new MenuModel();
        instance.increment_qnt(menuId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_if_pass_equal_to_old method, of class MenuModel.
     */
    @Test
    public void testCheck_if_pass_equal_to_old() throws Exception {
        System.out.println("check_if_pass_equal_to_old");
        String oldpass = "";
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.check_if_pass_equal_to_old(oldpass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update_password method, of class MenuModel.
     */
    @Test
    public void testUpdate_password() {
        System.out.println("update_password");
        String newpass = "";
        MenuModel instance = new MenuModel();
        instance.update_password(newpass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update_status_to_confirmed method, of class MenuModel.
     */
    @Test
    public void testUpdate_status_to_confirmed() {
        System.out.println("update_status_to_confirmed");
        MenuModel instance = new MenuModel();
        instance.update_status_to_confirmed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isItemInCart method, of class MenuModel.
     */
    @Test
    public void testIsItemInCart() {
        System.out.println("isItemInCart");
        MenuModel instance = new MenuModel();
        boolean expResult = false;
        boolean result = instance.isItemInCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy_to_payment method, of class MenuModel.
     */
    @Test
    public void testCopy_to_payment() {
        System.out.println("copy_to_payment");
        MenuModel instance = new MenuModel();
        instance.copy_to_payment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
