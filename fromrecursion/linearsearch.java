package fromrecursion;

import java.util.Scanner;

public class linearsearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the number of terms you want to enter");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the ele of the array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("the array ele are");
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	int search,flag=0;
	System.out.println("enter the search ele");
	search=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(search==a[i])
		{
		flag=1;
		 break;
		}
		else
			flag=0;
			
	}
	if(flag==1)
	{
		System.out.println("the ele is found");
	}
	else
		System.out.println("the ele is not found");
}
}
