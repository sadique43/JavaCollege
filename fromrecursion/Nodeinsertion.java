package fromrecursion;

import java.util.Scanner;

public class Nodeinsertion {
	public static Scanner sc=new Scanner(System.in);

	
	static node start=null;
static  node end=null;
	
	public static void create()
	{
		node p=new node();
		p.info=sc.nextInt();
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
			System.out.println("the node is empty");
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
	//insertion
	public static void insbeg()
	{
		node r=new node();
		System.out.println("insert the ele you want to insert in the node");
		r.info=sc.nextInt();
		if(start==null)
		{
			r.next=null;
			start=r;
			end=r;
			
					
		}
		else
		{
			r.next=start;
			start=r;
		}
	}
	public static void insend()
	{
		node p=new node();
		System.out.println("enter the ele you wnat to enter");
		p.info=sc.nextInt();
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
	public static void insanypos()
	{
		node p=new node();
		int pos;
		System.out.println("enter the ele u want to entr");
		p.info=sc.nextInt();
		System.out.println("enter the pos you wnat to enter");
		pos=sc.nextInt();
		node q=start;
		if(start==null)
		{
			start=p;
			end=p;
		}
		
		else
		{
			int i=1;
			while(i<=pos-2)
			{
				q=q.next;
				i++;
				
			}
			p.next=q.next;
			q.next=p;
		}
		
	}
	public static void delbeg()
	{
		if(start==null)
		{
			System.out.println("the link list is empty");
		}
		else if(start==end)
		{
			start=null;
			end=null;
	
		}
		else
		{
			node p=start;
			start=start.next;
			p.next=null;
		}
	}
	public static void delend()
	{
		if(start==null)
		{
			System.out.println("the link list is empty");
		}
		else if(start==end)
		{
			start=null;
			end=null;
		}
		else
		{
			node p=start;
			while(p.next.next!=null)
			{
				p=p.next;
			}
		
		p.next=null;
		end=p;
			
			
		}
	}
	public static void delanypos()
	{
		if (start==null)
		{
			System.out.println("the link list is empty");
		}
		else if(start==end)
		{
			delbeg();
			
		}
		else
		{
			node p=start;
			System.out.println("insert the position u want to delete");
			int pos=sc.nextInt();
			int i=1;
			while(i<=pos-2)
			{
				p=p.next;
				i++;
			}
			node q=p.next;
			p.next=q.next;
			q.next=null;
		}
	}
	public static void reverse()
	{
		node p=start;
		node q=p.next;
		p.next=null;
		while(q!=null)
		{
			node r=q.next;
			q.next=p;
			p=q;
			q=r;
		}
		node t=start;
		start=end;
		end=t;
		
	}

		public static void main(String[] args) {
			while(true)
			{
				System.out.println("enter 0) exit"+"\n"+" 1) creation"+"\n"+"2)dispaly"+"\n"+"3) insertion at begining"+"\n "+"4) insert at end"+"\n"+"5) insert at any position"+"\n "+"6) del ele at the beg"+"\n"+"7) to dele ele at the end"+"\n"+"8) del at any pos"+"\n"+"9) to reverse the link list");
			int n=sc.nextInt();
			switch(n)
			{
			case 0:
				System.exit(0);
				break;
			
			case 1:
				create();
				break;
			case 2:
				display();
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
			case 6:
				delbeg();
				break;
			case 7:
				delend();
				break;
			case 8:
				delanypos();
				break;
			case 9:
				reverse();
				break;
				default:
					System.out.println("invalid input");
			}
			}
			
		}
	

}

class node
{
	int info;
	node next;
}
