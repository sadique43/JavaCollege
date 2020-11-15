package linkedlist;

import java.util.Scanner;

public class node1 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 while(true)
	 {
		 System.out.println();
		 System.out.println("****menu******");
		 System.out.println("0: exit");
		 System.out.println("1: creation");
		 System.out.println("2: display");
		 System.out.println("3:  delete");
		 System.out.println("enter your choice");
		 int choice=sc.nextInt();
		 switch(choice)
		 {
		 case 0:
			 System.exit(0);
		 case 1:
			 create();
			 break;
		 case 2 :
			 display();
			 break;
		 case 3:
			 delete();
			 break;
			 default:
				 System.out.println("sorry press again");
		 
	 }
	
	 }
}


	public static Scanner sc=new Scanner(System.in);
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
			System.out.println("it is empty");
		}
		else
		{
			node t=start;
			while(t!=null)
			{
				System.out.print(t.info+"-->");
				
				t=t.next;
			}
		}
	}
	public static void delete()
	{
		if(start==null)
		{
			System.out.println("the linked list is empty");
		}
		else if(start==end)
		{
			start=start.next;
		}
		else
		{
			System.out.println("enter the node number to be deleted");
			int n=sc.nextInt();
			//n=n-1;
			node t=start;
			node p=end;
			node q=start;
			int m=0;
			while(m<n)
			{
				t=t.next;
				m++;
			}
			
			m=0;
			while(m<n-1)
			{
				q=q.next;
				m++;
			}
			q.next=t.next;
			q=t.next;
			
			t.next=null;
			q.next=null;
			
			
		}
	}
}
class node
{
	int info;
	node next;
}

