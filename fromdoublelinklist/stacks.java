package fromdoublelinklist;

import java.util.Scanner;

class stacks1
{
	static final int max=100;
	int a[]=new int[max];
	int top;
	boolean isEmpty()
	{
		return (top<0);
	}
	stacks1()
	{
		top=-1;
	}
	boolean push(int x)
	{
		if(top>=max-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		else
		{
			a[++top]=x;
			System.out.println(x+"is inserted into the stack");
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("stack underflow");
			return 0;
		}
		else
		{
			int x=a[top--];
			return x;
		}
	}
}

class stack1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	stacks1 s=new stacks1();
	System.out.println("enter the ele you want to enter into the stack");
	int k=sc.nextInt();
	int n[]=new int[k];
	for(int i=0;i<k;i++)
	{
		n[i]=sc.nextInt();
		s.push(n[i]);
	}
	int l;
	System.out.println("enter the no. of ele you want to pop");
	l=sc.nextInt();
	for(int i=0;i<l;i++)
	{
		System.out.println(s.pop()+" is poped out");
	}
	
	
}
}
