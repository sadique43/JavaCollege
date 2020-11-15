package sadique1;

import java.util.Scanner;

public class arrayLength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter a string");
		str=sc.nextLine();
		int str1=str.length();
		int c=stringLength(str);
		System.out.println(c);
		System.out.println(str1);
		
	}
	static int stringLength(String str)
	{
		int i=0;
		int count=0;
	char ch[]=str.toCharArray();
	for(char c: ch)
	{
		i++;
	}
	return (i);
		
	
}
}
