package fromrecursion;

import java.util.Scanner;

public class sumoffactors {
	public static void main(String args[]) 
    { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int n = sc.nextInt(); 
        System.out.println(divSum(n)); 
    } 
 

	
	  
	    // Function to calculate sum of all  
	    //divisors of a given number 
	    static int divSum(int n) 
	    { 
	        int result = 0; 
	      
	        for (int i = 2; i <= Math.sqrt(n); i++) 
	        { 
	            // if 'i' is divisor of 'n' 
	            if (n % i == 0) 
	            { 
	                // if both divisors are same 
	                // then add it once else add 
	                // both 
	                if (i == (n / i)) 
	                    result += i; 
	                else
	                    result += (i + n / i); 
	            } 
	        } 
	      
	        // Add 1 and n to result as above loop 
	        // considers proper divisors greater 
	        // than 1. 
	        return (result + n + 1); 
	          
	    } 
}
	    // Driver program to run the case 
	    