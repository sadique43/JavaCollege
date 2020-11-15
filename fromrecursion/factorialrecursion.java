package fromrecursion;

import java.util.Scanner;

public class factorialrecursion {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int m=fact(n);
System.out.println(m);
}
public static int fact(int n)
{
	if(n!=0)
	
		return(n*fact(n-1));
	else
		return 1;
	
}

}
