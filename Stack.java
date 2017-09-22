/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Jawwad Hamdani
 */


public class Stack extends Node{
        
    Node top;
    
    public
        Stack()
        {
            top = null;          //Initiate top to NULL
        }
        void Push(int data)          //Function to push data
        {
                Node temp = new Node();
		temp.value = data;
		temp.next = top;
		top = temp;
        }
        
        void Print()         //Function to Print Stack
        {
            	Node temp = top;

	// No nodes
	if (temp == null) {
		System.out.println("Stack Empty");
		return;
	}

	// One node in the list
	if (temp.next == null) {
		System.out.print(temp.value);
                System.out.print("-->");
                System.out.print("NULL");
	}
	else {
		// Parse and print the list
		do {
			System.out.print(temp.value);
			System.out.print("-->");
			temp = temp.next;
		} while (temp != null);

		System.out.print("NULL");
	}
                System.out.print("\n");
        }
        
        void Pop()              //Function To Pop A Value From Stack and Display It
        {
            Node temp = top;
            if(top == null)
            {
                System.out.println("Empty Stack");
            }
            
            else
            {
                System.out.println("The Top Value Is: "+ temp.value);
                top = temp.next;
                temp = null;
            }
        }
        
        void Peek()            //Function To Display The Top Value
        {
            if(top == null)
                System.out.println("Stack is Empty");
            else
                System.out.println("The Top Value Is: "+ top.value);
        }
}
