package fromrecursion;

import java.util.Scanner;

public class Binarysearchrecursion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the no. of terms u want to enter");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array ele");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int key;
	System.out.println("enter the ele to be searched");
	key=sc.nextInt();
	int r=binarySearch(a,0,n-1,key);
	if(r>=0)
	System.out.println("the search is succesfull");
	else
		System.out.println("the search is unsucessful");
}
public static int binarySearch(int a[],int l,int u,int key)
{
	if(l<=u)
	{
		int m=l+u/2;
		if(key==a[m])
			return m;
		else if(key>a[m])
			return(binarySearch(a,m+1,u,key));
		else
			return(binarySearch(a,l,m-1,key));
		
	}
	else
		return -1;
}
}
