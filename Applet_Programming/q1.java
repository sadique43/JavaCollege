package Applet_Programming;

import java.util.*;
public class q1 {
	

	public static void main(String args[])
	{
	
	int qlength=14;
	
	String str="AAABBAABB-AA--";
	char ch[]=new char[qlength];
	for(int i=0;i<str.length();i++)
	{
	ch[i]=str.charAt(i);
	}
	
	
	
	int n=0;
	int a=0;
	int b=0;
	int v=0;
	boolean v1=false;
	boolean k1=false;
	int k=0;
	System.out.println(str.length());
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]=='-')
		{
			
		k++;
		}
		if(ch[i]=='-' && v1==true)
		{
			v++;
		}

		
		if(ch[i]=='A')
		{
			a++;
			v1=false;
			k1=true;
			
		}
		 if(ch[i]=='B')
		{
			b++;
			
			v1=true;
			
			k1=false;
		}
		if(i>0)
		{
			
	if(ch[i]=='A' && k!=0)
	{
		
	a=a+k;
	
	
	}
		
		
		if(i<str.length() && v1==true)
		{
		
	
			if(v!=0)
	{
				b=b+v;
				v=0;
				
	
	}
			
			
			
	}

	
		}
		}
	if(a>b)
	{
	System.out.println("Candidate A wins the election");
	}
	else if(b>a)
	{
	System.out.println("Candidate B wins the election");
	}
	else if(a==b)
	{
	System.out.println("coalition gov forms");
	}

	}
	}

