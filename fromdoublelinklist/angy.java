package fromdoublelinklist;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class angy {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	String str="hello how are you";
	char ch[]=new char[str.length()];
	boolean v=true;
	for(int i=0;i<str.length();i++)
	{
	ch[i]=str.charAt(i);
	if(ch[i]==' ' )
	{
		v=true;
		
	}
	else if(ch[i]!=' ' && v==true)
	{
		if(ch[i]>=97 && ch[i]<=122)
		ch[i]=(char) (ch[i]-32);
		v=false;
	}
	}
	for(int i=0;i<str.length();i++)
	{
	System.out.print(ch[i]);
	}

}
}
