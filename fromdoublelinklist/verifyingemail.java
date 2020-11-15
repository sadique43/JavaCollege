package fromdoublelinklist;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class verifyingemail {
	 static boolean isValid(String email)
	{
		Pattern p=Pattern.compile("[a-zA-Z0-9]*(@)+[a-zA-Z0-9]*[.]+[a-zA-Z]*");
		
		
		
			return (p.matcher(email).matches());
			
	
			
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String email;
	System.out.println("enter the email");
	email=sc.nextLine();
	boolean a=isValid(email);
	System.out.println(a);
	
	
}
}
