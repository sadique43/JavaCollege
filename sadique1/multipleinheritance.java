package sadique1;

public class multipleinheritance {
public static void main(String[] args) {
	as n1=new c();
	bs n2=new c();
	n1.display();
	n2.display();
}
}
interface as
{
	void display();
}
interface bs
{
	void display();
}
class c implements as,bs
{
	public void display()
	{
		System.out.println("hi");
		System.out.println("hello");
	}
}
