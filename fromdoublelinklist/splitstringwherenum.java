package fromdoublelinklist;

import java.util.Scanner;

public class splitstringwherenum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String s="";
	for(int i=0;i<str.length();i++)
	{
		 s=str.replaceAll("\\d","\n");
		 
		
	}
	System.out.println(s);
}
}
