package sadique1;

import java.util.Scanner;

public class arrayReversewithoutsecondaryarray {
	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);	
		int a[]=new int[10];
		System.out.println("enter the array elements");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the array is");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		//reversing array without using secondary array
		for(int i=0,j=4;i<j;i++,j--)
		{
		 temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("the reversed array is");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
