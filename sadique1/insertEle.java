package sadique1;

import java.util.Scanner;
import java.lang.*;

public class insertEle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter the array ele");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int pos,ele;
		int n;
		do {
			
		System.out.println("enter the pos and ele");
		pos=sc.nextInt();
		ele=sc.nextInt();
		for(int i=a.length-1;i>pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=ele;
		System.out.println("the new array ele are");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("do you want to continue prees 1 or 0 to exit");
		n=sc.nextInt();
		}while(n==1);
		System.out.println("the final array is:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
