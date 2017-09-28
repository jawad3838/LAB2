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
    public void testFactorial_Positive() {
        
        System.out.println("Factorial Test For Positive Numbers:");
        Factorial instance = new Factorial();
        
        assertEquals(24, instance.factorial(4));      //Test if the expected result and output are equal
        assertEquals(6, instance.factorial(3));
        assertEquals(120, instance.factorial(5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
    @Test(expected = StackOverflowError.class)
    public void testFactorial_Negative() 
    {
      Factorial instance = new Factorial();
     
      instance.factorial(-2);
    }
}
