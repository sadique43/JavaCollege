package sadique1;

public class inheritance4 {
	public static void main(String[] args) {
		k_door d=new k_door();
		d.set_data();
		d.set_kdata();
		d.vol();
	}

}
class door
{
	int l,w;
	public void set_data()
	{
		l=4;
		w=9;
	}
}
class k_door extends door
{
	int h;
	public void set_kdata()
	{
		h=89;
	}
	public void vol()
	{
		System.out.println(l*w*h);
	}
}
