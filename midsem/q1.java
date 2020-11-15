package midsem;

import java.util.StringTokenizer;

public class q1 {
public static void main(String[] args) {
	String str1="hello iter i am sadique";
	String str2="";
	StringBuffer str3=new StringBuffer(str1);
	str3=str3.reverse();
	String str4=new String(str3);
	StringTokenizer str5=new StringTokenizer(str4);
	while(str5.hasMoreTokens())
	{
		String str6=str5.nextToken();
		StringBuffer str7=new StringBuffer(str6);
		str7=str7.reverse();
		String str8=new String(str7);
		str2=str2+str8+" ";
	}
	System.out.println(str2);
    
  }
}
