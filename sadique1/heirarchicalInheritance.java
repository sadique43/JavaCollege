package sadique1;

public class heirarchicalInheritance {
public static void main(String[] args) {
	axis aob=new axis();
	icici iob=new icici();
	sahara ios=new sahara();
	System.out.println(aob.getInterest());
	System.out.println(iob.getInterest());
	System.out.println(ios.getInterest());
}
}
class bank
{
	int getInterest()
	{
		return 0;
	}
	
}
class axis extends bank
{
	int getInterest()
	{
		return 8;
	}
}
class icici extends bank
{
	int getInterest()
	{
		return 5;
	}
}
class sahara extends bank
{
	int getInterest()
	{
		return 9;
	}
}