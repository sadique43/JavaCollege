package sadique1;

import java.util.Scanner;

public class java3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the array ele\n");
		for(int i=0;i<5;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("the array ele are\n");
		for(int arr: a)
		{
			System.out.println(arr);
		}
	}

}
