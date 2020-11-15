package sadique1;

import java.util.Scanner;

public class javaMethod {
	public static void main(String[] args) {
		//check whether a no. is even or odd using method
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("enter ano. to be checked\n");
		n=sc.nextInt();
		m=isEvenOdd(n);
		if(m==1)
			System.out.println("\"the no. "+n+"is even\"");
		else
			System.out.println("the no."+n+"is odd\n");
		
		
	}
	public static int isEvenOdd(int a)
	{
		if(a%2==0)
			return 1;
		else
			return 0;
		
	}

}
