package sadique1;

public class interfaceMethod {
public static void main(String[] args) {
	banksd b1=new axisee();
	banksd b2=new iciciee();
	banksd.st();//static method can e called using class name
	System.out.println(b1.display());
	System.out.println(b2.display());
	
}
}
interface banksd
{
	int display();
	static void st()
	{
		System.out.println("welcome to bank");
	}
}
class axisee implements banksd
{
	public int display()
	{
		return 6;
		
	}
}
class iciciee implements banksd
{
	public  int display()
	{
		return 9;
	}
}
