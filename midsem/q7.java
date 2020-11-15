package midsem;

import java.util.StringTokenizer;

public class q7 {
public static void main(String[] args) {
	String str="Rajeev Chandra Dash";
	String q="";
	int count=0;
	boolean v=true;
	String s[]=new String[str.length()];
	StringTokenizer str1=new StringTokenizer(str);
	while(str1.hasMoreTokens())
	{
		q=str1.nextToken();
		
		System.out.print(q.substring(0,1).toUpperCase());
	}
	
	System.out.print(q.substring(1));
	
	}
}
 