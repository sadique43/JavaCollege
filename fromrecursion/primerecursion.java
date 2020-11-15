package fromrecursion;

import java.util.Scanner;

public class primerecursion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	int n;
	System.out.println("enter a number to be checked");
	n=sc.nextInt();
	
	int m=check_prime(n,2);
	
	if(m==1)
		System.out.println("is prime");
	else
		System.out.println("is not prime");
}

static int  check_prime(int y,int i)
{
	
	if(i<y)
	{
		if(y%i!=0)
		{
			check_prime(y,++i);
		}
		else
		{
			return 0;
		}
	}
	return 1;
}
}

