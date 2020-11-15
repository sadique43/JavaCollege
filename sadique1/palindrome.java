package sadique1;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no. of digits you want to check");
		int d=sc.nextInt();
		int n[]=new int[d];
		int m[]=new int[d];
	System.out.println("enter the number one by one after pressing entr after each term");
	for(int i=0;i<d;i++)
	{
		n[i]=sc.nextInt();
		}
	
	//checking palindrome
	for(int i=0,j=n.length-1;i<d;i++,j--)
	{
		m[i]=n[j];
		
	}
	System.out.println("the reverse no. is");
	for(int i=0;i<d;i++)
	{
		System.out.println(m[i]);
	}
	for(int i=0;i<d;i++)
	{
		if(n[i]==m[i])
			flag=1;
		else 
			flag=0;
	}
	if(flag==1)
		System.out.println("the given number is a palindrome");
	else
		System.out.println("the no. is not a palindrome");
		
		
		
	}

}
