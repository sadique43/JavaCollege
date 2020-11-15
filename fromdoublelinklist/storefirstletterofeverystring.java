package fromdoublelinklist;

import java.util.Scanner;

public class storefirstletterofeverystring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
String result="";
boolean v=true;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)==' ')
	{
		v=true;
	}
	else if(str.charAt(i)!=' ' && v==true)
	{
		result=result+str.charAt(i);
		v=false;
	}
}
System.out.println(result);
	
}
}
