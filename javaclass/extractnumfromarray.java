package javaclass;

import java.util.Scanner;

public class extractnumfromarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sumstring(s)
	;
}
static void sumstring(String s)
{
	String temp="";
	String sum="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isDigit(ch))
		{
			temp=temp+ch;//this + is not for addition but for concatination
		
			sum=sum+temp;
	temp="";
		}
	}
	
	System.out.println(sum);
}
}
