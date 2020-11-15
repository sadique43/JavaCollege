package sadique1;

import java.util.Scanner;

public class arrayReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter the array ele");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\"the array ele are\"");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		rev(a);
		
	}
	static void rev(int a[])
	{
		int temp=1;
		for(int i=0,j=4;i<j;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
	}

}
