package Coronavirus;

public class eightmay {
	public static void main(String[] args) {
		parent a;
		a=new subclass1();
		a.print();
		a.show();
		a=new subclass2();
		a.print();
	}

}
class parent
{
	void print()
	{
		System.out.println("hi there abbas");
	}
	void show()
	{
		System.out.println("maar denge");
	}
}
class subclass1 extends parent
{
	void print()
	{
		System.out.println("hi sadique");
	}
	void show()
	{
		System.out.println("maar denge");
	}
}
class subclass2 extends parent
{
	void print()
	{
		System.out.println("hi mazhar");
	}
}
