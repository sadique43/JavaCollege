package sadique1;

import java.util.Scanner;

public class exception1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int k,p;
	System.out.println("enter the value of k");
	k=sc.nextInt();
	try
	{
		p=1/k;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("bad input");
		
	}
	System.out.println("hello there,,meet you again");
}
}
