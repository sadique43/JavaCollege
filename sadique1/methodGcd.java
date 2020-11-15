package sadique1;

import java.util.Scanner;
//to find the gcd of two numbers using modulus operator

public class methodGcd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers\n");
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=gcdFind(a,b);
	System.out.println(c);
	
}
public static int gcdFind(int a,int b)
{
	int r;
	while(b!=0)
	{
	r=a%b;
	a=b;
	b=r;
}
int gcd=a;
return (gcd);
}
}