package sadique1;

public class inheritance2 {
public static void main(String[] args) {
	kitchen_room r=new kitchen_room();//always make the obj of child class
	r.l=4;
	r.w=9;
	r.h=10;
	r.volume();
}
}
class room
{
	int l,w;
}
class kitchen_room extends room
{
	int h;
	public void volume()
	{
		System.out.println(l*w*h);
	}
}
