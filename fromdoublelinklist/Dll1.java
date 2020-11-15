package fromdoublelinklist;

import java.util.Scanner;

public class Dll1 {
	public static Scanner sc=new Scanner(System.in);
	static node start=null;
	static node end=null;
	
public static void main(String[] args) {
	while(true)
	{
	
	System.out.println("enter:"+"\n"+"0) to exit"+"\n"+"1) creation of dll"+"\n"+"2)display of dll"+"\n"+"3) insert at begining"+"\n"+"4) insert at end"+"\n"+"5) insert at any position");
	int n=sc.nextInt();
	switch(n)
	{
	case 0:
		System.exit(0);
	case 1:
		createdll();
		break;
	case 2:
		displaydll();
		break;
	case 3:
		insbeg();
		break;
	case 4:
		insend();
		break;
	case 5:
		insanypos();
		break;
		default:
			System.out.println("invalid input");
	}
	
	}
}
public static void createdll()
{
	node p=new node();
	System.out.println("enter the ele");
	p.info=sc.nextInt();
	if(start==null)
	{
		start=p;
		end=p;
	}
	else
	{
		end.next=p;
		p.prev=end;
		end=p;
	}
	
}

public static void displaydll()
{
	if(start==null)
		System.out.println("the dll is empty");
	else
	{
	node t=start;
	while(t!=null)
	{
		System.out.println(t.info+"-->");
		t=t.next;
	}
	
}
}
public static void insbeg()
{
	node p=new node();
	System.out.println("enter the inserting ele");
	p.info=sc.nextInt();
	if(start==null)
	{
		start=p;
		end=p;
		p.next=null;
	}
	else
	{
		p.next=start;
		start.prev=p;
		start=p;
	}
}
public static void insend()
{
	node t=new node();
	System.out.println("enter the ele to be inserted");
	t.info=sc.nextInt();
	if(start==null)
	{
		start=t;
		end=t;
		t.next=null;
	}
	else
	{
	t.prev=end;
	end.next=t;
	end=t;
		
	}
}
public static void insanypos()
{
	node p=new node();
	System.out.println("insert the element");
	p.info=sc.nextInt();
	int pos;
	System.out.println("enter the position");
	pos=sc.nextInt();
	int count=0;
	node t=start;
	while(t!=null)
	{
		count++;
		t=t.next;
	}
	if(pos<=count+1)
	{
		if(pos==1)
		{
			insbeg();
		}
		else if(pos==count+1)
		{
			insend();
		}
		else
		{
			node q=new node();
			int i=0;
			while(i<=pos-2)
			{
				q=q.next;
				i++;
			}
			p.next=q.next;
			p.prev=q;
			q.next.prev=p;
			q.next=p;
		}
	}
}
}
class node

{
	node prev;
	int info;
	node next;
}


