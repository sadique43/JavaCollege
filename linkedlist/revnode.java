package linkedlist;

import java.util.Scanner;

public class revnode {
	public static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	while(true)
	{
	System.out.println("enter the choice "+"\n"+"1)1 to crteate"+"\n"+"2)2 to dispaly"+"\n"+"3)3 to exit"+"\n"+"4) count no. of nodes created"+"\n"+"5) to search an ele");
	int ch=sc.nextInt();
	switch (ch)
	{
	case 1:
		create();
		break;
	case 2:
		display();
		break;
	case 3:
		System.exit(0);
	case  4:
		counted();
		break;
	case 5:
		search();
		break;
		default:
			System.out.println("invalid input");
	}
	}
	
	
}
static node start=null;
static node end=null;

public static void create()
{
	node p=new node();
	p.info=sc.nextInt();
	p.next=null;
	if(start==null)
	{
		start=p;
		end=p;
	}
	else
	{
		end.next=p;
		end=p;
	}
	
}
public static void display()
{
	
	if(start==null)
	{
		System.out.println("empty linked list");
	}
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
	public static void counted()
	{
		int counts=0;
		node t=start;
		if(start==null)
		{
			System.out.println("it's empty lol!!!");
		}
		else
		{
			while(t!=null)
			{
				t=t.next;
				counts++;
			}
		}
		System.out.println(counts);
	}
	public static void search()
	{
		int sele,found=0;
		System.out.println("enter the ele to be searched");
		sele=sc.nextInt();
		node t=start;
		if(start==null)
		{
			System.out.println("the list is empty");
		}
		else
		{
			while(t!=null)
			{
				if(sele==t.info)
				{
					found=1;
					break;
				
				}
				t=t.next;
			}
				if(found!=0)
					System.out.println("the ele is found");
				else
					System.out.println("the ele is not found");
			}
		}
	
}

class node3
{
	int info;
	node next;
}
