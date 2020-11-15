package sadique1;

public class thisKeyword {
public static void main(String[] args) {
	tom t1=new tom(2,7);
	 t1.display();
	
}
}
class tom
{
	int a,b,c;
	tom()
	{
		a=3;
	}
	tom(int x,int y)
	{
		this();
		b=x;
		c=y;
	}
	public void display()
	{
		System.out.println(a*b*c);
	}
}
