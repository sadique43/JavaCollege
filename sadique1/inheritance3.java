package sadique1;

public class inheritance3 {
	
public static void main(String[] args) {
	k_room r=new k_room();
	r.set_data(2,4);
	r.set_data(5);
	r.vol();
}
}
class romss
{
	int l,w;
	public void set_data(int x,int y)
	{
		l=x;
		w=y;
	}
}
class k_room extends romss
{
	int h;
	public void set_data(int z)
	{
		h=z;
	}
	public void vol()
	{
		System.out.println(l*w*h);
	}
}
