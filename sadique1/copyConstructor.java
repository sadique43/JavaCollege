package sadique1;

public class copyConstructor {
public static void main(String[] args) {
	boxes b1=new boxes();
	boxes b2=new boxes(1,2,3);
	boxes b3=new boxes(b2);
	b1.display();
	b2.display();
	b3.display();
}
}
class boxes
{
	int l,w,d;
	boxes()
	{
		l=-1;
		w=-1;
		d=-1;
	}
	boxes(int x,int y,int z)
	{
		l=x;
		w=y;
		d=z;
	}
	boxes(boxes ob)//copy constructor
{
		l=ob.l;
		w=ob.w;
		d=ob.d;
}
	public void display()
	{
		System.out.println(l*w*d);
	}
}
