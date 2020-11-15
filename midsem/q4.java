package midsem;

import java.util.regex.*;

public class q4 {
	
public static void main(String[] args) {
	complex c1=new complex(5,7);
	complex c2=new complex(6,7);
	int sumr=c1.real+c2.real;
	int sumimg=c1.img+c2.img;
	System.out.println(sumr);
	System.out.println(sumimg);
			
	


}
}
class complex
{
	public int real;
	public int img;

	complex(int i,int j)
	{
		real=i;
		 img=j;
	}
}
