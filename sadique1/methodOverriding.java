package sadique1;

public class methodOverriding {
public static void main(String[] args) {
	girl g=new girl();
	g.display();
	girl g1=new girl();
	
	
}
}
class boy
{
	public void display() {
		System.out.println("hi i am boy");
	}
}
class girl extends boy
{
	public void display()
	{
		System.out.println("hi i am girl");
	}
}
