package Coronavirus;






import java.util.Scanner;
class Node{
	protected int regd_no;
	protected float mark;
	protected Node next;
}

public class link11{


	static Node start = null;
	static Node end=null;
	static Node q;
	static Scanner sc= new Scanner(System.in);
	
	

public static void  create() {{



		
		//Node q=null;//
		//Scanner sc= new Scanner(System.in);//
	//int ch;//
	Node p = new Node();
	
	System.out.println("Enter the registration number");
	p.regd_no =sc.nextInt();
		System.out.println("Enter the marks");
	p.mark =sc.nextFloat();
		p.next = null;
		if (start == null) {
	start = p;
			  q = p;
		} 
	else {
			q.next = p;
		q = p;
			}
		
       }
	
}

public static void display() {
	
	
	Node p = start;
	while (p!=null)
	{
		System.out.print("reg.no"+" "+p.regd_no+" "+"mark"+" "+p.mark+"->");
	p=p.next;
	
	}
	System.out.println();
	  	}
	
public static void insertbeg(){
	
	Node p=new Node();
	System.out.println("Enter regidtration number");
	p.regd_no=sc.nextInt();
	System.out.println("Enter the marks");
 p.mark=sc.nextFloat();
 p.next=start;
	start=p;
	}
	
public static void insertend(){
	
	Node p=new Node();
	System.out.println("Enter the registration number");
	p.regd_no=sc.nextInt();
	System.out.println("Enter the mark");
	p.mark=sc.nextFloat();
	p.next=null;
	Node q=start;
	while(q.next!=null){
		q=q.next;
	}
	q.next=p;
}

public static void Insertatany() {
	
	Node s=start;
	System.out.println("enter the position to enter");
	 int loc=sc.nextInt();
	 Node p=new Node();
		System.out.println("Enter the registration number");
		p.regd_no=sc.nextInt();
		System.out.println("Enter the mark");
		p.mark=sc.nextFloat();
	 p.next= null;
	 int i=1;
	 if (i==loc) {
	 p.next=start;
		start=p;
	 }
	 else {
		 while (i<loc-1) {
			 i=i+1;
			 s=s.next;
		 }
		 p.next= s.next;
		 s.next =p;
	 } 
}
	
public static void delbeg() {
		
	
	if(start==null){
				System.out.println("list is empty");
			}
			else{
				start=start.next;
			}
		}

public static void delend() {
		
	Node p=start;
		Node q=start;
		if(start==null){
			System.out.println("list is empty");
		}
		else {
			while(p.next!=null){
				q=p;
				p=p.next;
			}
			System.out.println("Item deleted is"+
			"reg.no"+" "+p.regd_no+" "+"mark"+" "+p.mark);
			q.next=null;
	}
	}
	

public static void delany() {
	
	System.out.println("Enter the location want to delete");
	int loc=sc.nextInt();
	if (loc==1) {
		start=start.next;
}
else {
	int i=1;
	Node p= start;
	Node q =null;
	 i=1;
	while(i<loc) {
		i=i+1;
		q=p;
		p=p.next;
}
	System.out.println("Node deleted succesfully is below");
System.out.println("reg.no"+" "+p.regd_no+" "+"mark"+" "+p.mark+"Item deleted");
q.next=p.next;
}
}


public static void delbyregno() {
 
	Node s=start;
	int f=0;
	int k;
	System.out.println("Enter the registration no you want to delete");
	 k=sc.nextInt();
	while(s!=null){
		if(s.regd_no==k){
			System.out.println(s);
			f=1;
		}
		s=s.next;
	}
	if(f==0)
	System.out.println("Element not found");
		else
			delany();
		//System.out.println("Element found");//
		}

public static void search(){
	
	
	Node s=start;
	int flag=0;
	int ele;
	System.out.println("Enter the registration no to search");
	ele=sc.nextInt();
	
	while(s!=null){
		if(s.regd_no==ele){
			System.out.println(s);
			flag=1;
		}
		s=s.next;
	}
	if(flag==0)
	System.out.println("Element not found");
		else
		System.out.println("Element found");
		}


public static void sort() {
//sorting on the basis of student marks
	Node i,j;
	for (i=start;i.next!=null;i=i.next) {
		for(j=start.next;j!=null;j=j.next) {
			if(i.mark>j.mark) {
				float temp =i.mark;
				i.mark=j.mark;
				j.mark= temp;
				int temp1 =i.regd_no;
				i.regd_no=j.regd_no;
				j.regd_no= temp1;
			
	}
		}
			}
	Node p = start;
	while (p!=null)
	{
		System.out.print("reg.no"+" "+p.regd_no+" "+"mark"+" "+p.mark+"->");
	p=p.next;
	
	}
	System.out.println();
	
	
}

public static int count(){
	
	int c=0;
	Node s=start;
	while(s!=null){
		c=c+1;
		s=s.next;
	}
	return c;
}
	


	public static void reverse1()
	{
	Node pointer=start;
	Node previous=null;
	Node current=null;
	while(pointer!=null)
	{
		current=pointer;
		pointer=pointer.next;
		
		current.next=previous;
		previous=current;
		start=current;
	}
	
	Node node=start;
	while (node!=null)
	{
		System.out.print("reg.no"+" "+node.regd_no+" "+"mark"+" "+node.mark+"->");
	node=node.next;
	
	}
	System.out.println();
	
	}
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t;
Scanner sc=new Scanner (System.in);
Node start=null;
while(true) { 
System.out.println("*****MENU*****"); 
System.out.println("0:Exit"); 
System.out.println("1:Creation");
System.out.println("2:Display"); 
System.out.println("3:Insert at beg");
System.out.println("4:Insert at end");
System.out.println("5:Insert at specific location"); 
System.out.println("6:Delete at beg");
System.out.println("7:Delete at end"); 
System.out.println("8:Delete at specific location"); 
System.out.println("9:Deletion by registration number");
System.out.println("10.Search an element");
System.out.println("11: Sorting the list"); 
System.out.println("12:Counting of nodes");
System.out.println("13:Reverse the list");
System.out.println("Enter the choice");   
t=sc.nextInt();   
switch(t)   { 
case 0:
System.exit(0);
case 1:

	create();
break;
case 2:
	display();
break;
case 3:
	insertbeg();
break;
case 4 :
	insertend();
break;
case 5:
	Insertatany();
break;
case 6:
	delbeg();
break;
case 7:
	delend();
break;
case 8 :
	delany();
break;
case 9 :
	delbyregno();
break;
case 10 :
	search ();
	break;
case 11:
	 sort();
	break;

case 12:
	 System.out.println(count());
	break;
case 13 :
	reverse1();
	break;
default:
System.out.println("Wrong choice");
break;
}
}
	}} 