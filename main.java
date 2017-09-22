/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Jawwad Hamdani
 */
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);      
        Factorial f = new Factorial();
        int number = 0;
        
        System.out.println("Enter A Number To Calculate its Factorial: ");  //Take Input from User
        number = sc.nextInt();
        
        System.out.println("The Factorial Of "+number+" is "+f.factorial(number)); //Display Factorial
        
        // Append nodes to the list
        Stack s = new Stack();
	s.Push(100); s.Print();
	s.Push(200); s.Print();
	s.Push(300); s.Print();
	s.Push(400); s.Print();
	s.Push(500); s.Print();

	// Delete nodes from the list
	s.Pop(); s.Print();
	s.Pop(); s.Print();
	s.Pop(); s.Print();
	s.Pop(); s.Print();
	s.Pop(); s.Print();
        // TODO code application logic here
    }
}
    

