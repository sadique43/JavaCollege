package fromrecursion;

import java.util.Scanner;

public class Binarysearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the no. of terms you want to entr");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array ele");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int l,u,key,m;
	l=0;
	u=n-1;
	System.out.println("enter the ele to search");
	key=sc.nextInt();
	m=(l+u)/2;
	int i=0;
	while(l<=u && (key!=a[m]))
	{
		
		if(key>a[m])
			l=m+1;
		else
			u=m-1;
		m=(l+u)/2;
		
	}
		if(key==a[m]) {
			System.out.println("the ele is found at index"+" "+m);
		
		}
		else
		System.out.println("the ele is not found");
		
	
	
}
}
