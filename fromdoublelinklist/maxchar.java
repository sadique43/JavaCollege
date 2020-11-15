package fromdoublelinklist;

import java.util.Scanner;

public class maxchar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String ch="";
	for(int i=0;i<str.length();i++)
	{
		ch=ch+str.charAt(i+1);
	}
}
}
