package javaclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Map<String,Integer> locker=new HashMap<String,Integer>();
	int n;
	System.out.println("enter the number of entries you want to made");
	n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		String name;
		int pass;
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the password");
		pass=sc.nextInt();
		locker.put(name,pass);
	}
	
	int ch;
	do
	{
		String s2;
		System.out.println("enter the customers name");
		s2=sc.next();
		if(locker.containsKey(s2))
		{
			System.out.println(s2+"="+locker.get(s2));
		}
		else
		{
			System.out.println("sorry no such customer exits");
		}
		
		System.out.println("do u want to search for another customer?-1-yes and 0-no");
	ch=sc.nextInt();
	}while(ch==1);
}
}
