package fromdoublelinklist;

import java.util.Scanner;

public class stacklinkedlist {
	public static Scanner sc=new Scanner(System.in);
    static node top=null;
    public static void push()
    {
    	node p=new node();
    	System.out.println("enter the ele");
    	p.info=sc.nextInt();
    	p.next=top;
    	top=p;
    }
    public static void pop()
    {
    	node p=top;
    	if(top==null)
    	{
    		System.out.println("stack underflow");
    	}
    	else
    	{
    		top=top.next;
    		p.next=null;
    		System.out.println("the popped out ele is="+" "+p.info);
    	}
    }
    public static void display()
    {
    	node t=top;
    	if(top==null)
    	{
    		System.out.println("stack underflow");
    	}
    	else
    	{
    		while(t!=null)
    		{
    			System.out.println(t.info+"-->");
    			t=t.next;
    		}
    	}
    }
	public static void main(String[] args) {
		int ch;
		while(true)
		{
		System.out.println("enter "+"\n"+" 1) create"+"\n"+"2)pop "+"\n"+"3) display");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			push();
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
			default:
				System.out.println("invalid input");
		}
		}
		
		
		
	}

}
class node5
{
	int info;
	node next;
}
