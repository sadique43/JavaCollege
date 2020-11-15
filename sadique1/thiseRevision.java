package sadique1;

public class thiseRevision {
public static void main(String[] args) {
	boxed b=new boxed(3,4);
	b.display();
}
}
class boxed
{
	int l,w,h;
	boxed()
	{
		l=9;
	}
	boxed(int x,int y)
	{
		this();
		w=x;
		h=y;
	}
	public void display()
	{
		System.out.println(l*w*h);
	}
}

