package sadique1;

import java.util.Scanner;

public class exception2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5};
	int k;
	System.out.println("enter the value of k");
	k=sc.nextInt();
	try
	{
		k=a[k]+9;
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("please be correct at input");
	}
	System.out.println("meet you again...bye!!!");
}
}
