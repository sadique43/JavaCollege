package fromdoublelinklist;

import java.util.Scanner;

public class maxnuminstring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char ch;
	int num=0,res=0;
	
	for(int i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		if(Character.isDigit(ch))
		{
		num=num*10+(str.charAt(i)-'0');//str.charAt(i)=>returns actual int value
		System.out.println(num);
		}
		else
		{
			res=Math.max(res, num);
			num=0;
		}
	}
	System.out.println(Math.max(res, num));
	
//System.out.println("max number is="+ma);
}
}
