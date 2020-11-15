package Coronavirus;
import java.io.*;
//chap 10
public class bufferreader {
public static void main(String[] args) {
	throws IOException
	{
		InputStreamReader inp = null;
		inp= new InputStreamReader(System.in);//storing the input in inp
		System.out.println("enter the characters"+ "and '0' to quit");
		char c;
		do
		{
			c=(char)inp.read();
			System.out.println(c);
			while(c!='0');
		}
	}
}
}
