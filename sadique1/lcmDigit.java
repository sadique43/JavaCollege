package sadique1;

import java.util.Scanner;

public class lcmDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		double x;
		a=sc.nextInt();
		b=sc.nextInt();
		x=findLcm(a,b);
		double l=a*b/x;
		System.out.println(l);

}
	public static double findLcm(int a,int b)
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
