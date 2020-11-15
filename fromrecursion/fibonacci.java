package fromrecursion;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the number of  series youn want to have");
	n=sc.nextInt();
	int m=fibo(n);
	System.out.println(m);
}
public static int fibo(int n)
{
	if(n==0)
		return 0;
	else if(n==1)
		return 1;
	else
		return (fibo(n-2)+fibo(n-1));
}
}
