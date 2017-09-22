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
public class StackTest {
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Push method, of class Stack.
     */
    @Test
    public void testPush() {
        
        System.out.println("Push");
        int data = 6;
        Stack instance = new Stack();
        instance.Push(5);
        instance.Push(data);
        instance.Print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Print method, of class Stack.
     */
    @Test
    public void testPrint() {
        System.out.println("Print");
        Stack instance = new Stack();
        instance.Push(5);
        instance.Print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of Peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("Peek");
        Stack instance = new Stack();
        instance.Push(5);
        instance.Peek();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testPop() {
        System.out.println("Pop");
        Stack instance = new Stack();
        instance.Push(5);
        instance.Pop();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
