package sadique1;

public class constructor {
	public static void main(String[] args) {
		Box b1=new Box(2,5,9);
		int volume=b1.volume();
		System.out.println(volume);
		
	}

}
class Box
{
	int l,w,d;
	Box(int x,int y,int z)//constructor:a special type of method which automatically get called when an object is created
	{
		l=x;
		w=y;
		d=z;
	}
	public int volume()
	{
		int vol=l*w*d;
		return vol;
	}
}
