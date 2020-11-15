package fromdoublelinklist;

import java.util.Scanner;

public class twentyninefeb {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	double i=(float)3.0;
	try {
		
	
	 i=Integer.parseInt(str1);
	 System.out.println(i);
	}
	catch(NumberFormatException e)
	{
	
	System.out.println("invalid number"+str1);
	System.out.println(e);
	
}
}
}
