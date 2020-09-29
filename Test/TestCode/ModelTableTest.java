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
public class ModelTableTest {
    
    public ModelTableTest() {
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
     * Test of getMenuname method, of class ModelTable.
     */
    @Test
    public void testGetMenuname() {
        System.out.println("getMenuname");
        ModelTable instance = null;
        String expResult = "";
        String result = instance.getMenuname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenuname method, of class ModelTable.
     */
    @Test
    public void testSetMenuname() {
        System.out.println("setMenuname");
        String menuname = "";
        ModelTable instance = null;
        instance.setMenuname(menuname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenuid method, of class ModelTable.
     */
    @Test
    public void testGetMenuid() {
        System.out.println("getMenuid");
        ModelTable instance = null;
        int expResult = 0;
        int result = instance.getMenuid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMenuid method, of class ModelTable.
     */
    @Test
    public void testSetMenuid() {
        System.out.println("setMenuid");
        int menuid = 0;
        ModelTable instance = null;
        instance.setMenuid(menuid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity_item method, of class ModelTable.
     */
    @Test
    public void testGetQuantity_item() {
        System.out.println("getQuantity_item");
        ModelTable instance = null;
        int expResult = 0;
        int result = instance.getQuantity_item();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity_item method, of class ModelTable.
     */
    @Test
    public void testSetQuantity_item() {
        System.out.println("setQuantity_item");
        int quantity_item = 0;
        ModelTable instance = null;
        instance.setQuantity_item(quantity_item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ModelTable.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ModelTable instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ModelTable.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        ModelTable instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
