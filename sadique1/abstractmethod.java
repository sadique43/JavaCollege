package sadique1;

public class abstractmethod {
public static void main(String[] args) {
	bankss b1=new axises();
	bankss b2=new icicies();
	System.out.println(b1.getInterest());
	System.out.println(b2.getInterest());
	
}
}
abstract class bankss//abstract class
{
	abstract int getInterest();//abstract method
	void display()//non abstract method
	{
		System.out.println("welcome to bank");
	}
	
}
class axises extends bankss
{
	public int getInterest()
	{
		return (7);
	}
}
class icicies extends bankss
{
	public int getInterest()
	{
		return 9;
		
	}
}
