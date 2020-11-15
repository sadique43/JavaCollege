package sadique1;

import java.util.Scanner;

public class javaArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("entr the  no. of ele u want to entr");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array ele");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("the array ele are");
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	int sum=arraySum(a);
	System.out.println("the sum of the array="+sum);
}
static int arraySum(int a[])
{
	int sum=0;
	for(int i=0;i<a.length;i++)
{
		sum=sum+a[i];
}
	return (sum);
}
}
