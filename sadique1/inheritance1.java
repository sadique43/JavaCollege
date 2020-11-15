package sadique1;

public class inheritance1 {
public static void main(String[] args) {
	b obj=new b();
	obj.x=5;
	obj.y=10;
	obj.display();
}
}
class a
{
	int x;
}
class b extends a
{
	int y;
	public void display()
	{
		System.out.println(x+" "+y);
	}
}
