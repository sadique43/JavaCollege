package sadique1;

import java.util.Scanner;

public class java5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=new String[5];
		System.out.println("enter the strings one by one\n");
		for(int i=0;i<5;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("\"the array are:\n\"");
		for(String strs: str)
		{
			System.out.println(strs);
		}
	}

}
