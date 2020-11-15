package sadique1;

public class javamethod2 {
	public static void main(String[] args) {
		int a=10,b=20;
		swapInt(a,b);
	}
	public static void swapInt(int a,int b)
	{
		int c;
		c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("a=\t"+a);
		System.out.println("b=\t"+b);
		
	}

}
