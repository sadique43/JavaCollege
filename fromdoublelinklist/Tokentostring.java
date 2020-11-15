package fromdoublelinklist;

import java.util.Scanner;

public class Tokentostring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the no of tokens u have");
	n=sc.nextInt();
	
	String ch[]=new String[n];
	System.out.println("enter the string");
	
	for(int i=0;i<ch.length;i++)
	{
		ch[i]=sc.next();
	}
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]+" ");
	}
}
}
