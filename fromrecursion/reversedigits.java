package fromrecursion;

import java.util.Scanner;

public class reversedigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter a no.");
	n=sc.nextInt();
	int rem=0;
	
	reverse(n,rem);
	
}
public static void reverse(int n,int rem)
{

	if(n>0)
		
	{
		  int rev=n%10;
		
	   rem=rem*10+rev;
	
	reverse(n=n/10,rem);
	}
	else
	
	System.out.println(rem);

	
		
}
}

