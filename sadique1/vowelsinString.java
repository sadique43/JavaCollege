package sadique1;

import java.util.Scanner;

public class vowelsinString {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("enter a string");
    str=sc.nextLine();
    char ch[]=str.toCharArray();
    for(char c: ch)
    {
    	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
    	{
    		count++;
    	}
    	
    }
    System.out.println("the  no. of vowels present in the string="+count);
}
}
