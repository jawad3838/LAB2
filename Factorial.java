/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Jawwad Hamdani
 */
public class Factorial {
    
    int factorial(int n)
    {
        if (n == 0 || n == 1)        //Base Case
            return 1;
        else
            return n * factorial(n-1);    //Recursive Call
    }
}
