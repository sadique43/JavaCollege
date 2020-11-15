package sadique1;

public class staticKeyword {
public static void main(String[] args) {
	s2 s=new s2();
	s2 s1=new s2();
	//s2 s2=new s2();
	s.display();
	s1.display();
	//s2.display();
	
}
}
class student
{
	static int c=0;
	student()
	{
		c++;
	}
}
class s2 extends student
{
	public void display()
	{
		System.out.println(c);
	}
}
