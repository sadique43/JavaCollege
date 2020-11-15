package sadique1;

public class super_keyword {
public static void main(String[] args) {
	window1 w=new window1(4,5);
	w.display();
}
}
class window
{
	int l;
	window()
	{
		l=9;
	}
}
class window1 extends window
{
	int w,h;
	window1(int x,int y)
	{
		super();//super() calls the constructor of the parent class
		w=x;
		h=y;
	}
	public void display()
	{
		System.out.println(l*w*h);
	}
}
