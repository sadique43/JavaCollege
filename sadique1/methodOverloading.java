package sadique1;

import java.util.Scanner;

public class methodOverloading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,l,b;
		System.out.println("enter the radius of the circle\n");
		r=sc.nextInt();
		System.out.println("enter the length of the circle\n");
		l=sc.nextInt();
		System.out.println("enter the breadth of the circle\n");
		b=sc.nextInt();
		double area1=area(r);
		int area2=area(l,b);
		System.out.println(area1);
		System.out.println(area2);
		
	}
	//here the concept of method overloading takes place...as there are two methods with the same name but different parameters
	public static double area(int r)
	{
		double area=3.167*r*r;
		return (area);
	}
	public static int area(int l,int b)
	{
		int area=l*b;
		return (area);
	}

}
