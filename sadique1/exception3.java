package sadique1;

import java.io.IOException;
import java.util.Scanner;

public class exception3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the age of the person");
	n=sc.nextInt();
	try
	{
		check_age(n);
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("not eligible for voting");
	}
	System.out.println("your good day sir");
}


	public static void check_age(int n) throws IOException
	{
		if(n<18)
			throw new IOException();
		else
			System.out.println("welcome for voting");
	}
}
