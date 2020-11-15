package sadique1;
//multilevel inheritance

public class inheritance5 {
public static void main(String[] args) {
	cube c=new cube();
	c.display1();
	c.display2();
	c.display3();
	
}
}
class shape
{
	public void display1()
	{
		System.out.println("it is a shape");
	}
}
class rectangle extends shape
{
	int l=8,w=9;
	public void display2()
	{
		System.out.println(l*w);
	}
	
}
class cube extends rectangle
{
	int a=3;
	public void display3()
	{
		System.out.println(l*w*a);
	}
}
