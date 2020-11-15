package fromdoublelinklist;

import java.util.Scanner;


class Stacks { 
    static final int MAX = 1000; //final keyword makes the data-type immutable(unchangeable)
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stacks() //constructor
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; //top increases first then the ele is inserted
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; //top is decremented after bcs we need to delete that index ele then move down
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
} 
  
// Driver code 
public class stack { 
	public static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) 
    { int ch;
    	do {
        Stacks s = new Stacks(); //creating object of the class
        System.out.println("enter how many ele do you want to enter into the stack");
        int k=sc.nextInt();
        int n[]=new int[k];
        System.out.println(("enter the element to pushed into the stack"));
        for(int i=0;i<k;i++)
        {
        n[i]=sc.nextInt(); 
        s.push(n[i]);
        }
        System.out.println("enter how many ele do you want to pop from the stack");
        int l=sc.nextInt();
    
        for(int i=0;i<l;i++)
        {
        System.out.println(s.pop() + " Popped from stack"); 
        }
        
        System.out.println("DO YOU WANT TO CONTINUE?\n ENTER 1 FOR \"YES\" and 2 FOR \"NO\"");
        ch=sc.nextInt();
        
    
    }while(ch==1);
    }
}
