/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Syed Jawwad Hamdani
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of factorial method, of class Factorial.
     */
    @Test
    public void testFactorial() {
        
        System.out.println("factorial");
        int n = 5;
        Factorial instance = new Factorial();
        int expResult = 999;
        int result = instance.factorial(n);
        assertEquals(expResult, result);      //Test if the expected result and output are equal
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
