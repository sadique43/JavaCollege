package javaclass;

import java.util.Scanner;

public class sumofrealno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the decimal digit you want enter");
	int n=sc.nextInt();
	double a=23.45;
	int b=(int)a;
	
	double c=(double)(a-b);
	
	int i=0;
	int x;
	while(n>i)
	{
	if(i<n)
	{
		 c=c*10;
	int d=(int)Math.ceil(c);
	System.out.println(d);
	x=d;
	
	System.out.println(x);
	System.out.println(b+x);
	i++;
	}
	}
}
}
