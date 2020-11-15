package sadique1;

import java.util.Scanner;

public class stringlength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		int str1=stringLength(str);
		System.out.println(str1);
	}
	static int stringLength(String str)
	{
		int i=0;
		char ch[]=str.toCharArray();
		for(char c: ch)
		{
			i++;
		}
		return (i);
	}

}
