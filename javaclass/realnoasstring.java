package javaclass;

public class realnoasstring {
public static void main(String[] args) {
	String s="23.45";
	String t="";
	String q="";
	int i;
	for( i=0;s.charAt(i)!='.';i++)
	{
		t=t+s.charAt(i);
	}
	for(int j=i+1;j<s.length();j++)
	{
		q=q+s.charAt(j);
	}
	int a=Integer.parseInt(t);
	int b=Integer.parseInt(q);
	System.out.println(a+b);
}
}
