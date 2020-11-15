package sadique1;

import java.util.Scanner;

public class arrayDeletion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("enter the array ele");
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	int pos;
	System.out.println("enter the pos to be deleated");
	pos=sc.nextInt();
	for(int i=pos-1;i<4;i++)
	{
		a[i]=a[i+1];
	}
	System.out.println("the array after deletion is:");
	for(int i=0;i<4;i++)
	{
		System.out.println(a[i]);
	}
}
}
