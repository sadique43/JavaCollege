package fromrecursion;

public class recursion1 {
public static void main(String[] args) {
	int k=4;
	foo(k);
}

public static void foo(int k)
{
	if(k>0)
	{
		System.out.println("hello there");
	foo(k-1);
}
}

}