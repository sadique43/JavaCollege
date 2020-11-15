package javaclass;

import java.util.Scanner;

public class delimeter {
public static void main(String[] args) {
	String st=new String("sadique is the brother of nkhy");
	Scanner sc=new Scanner(st);
	sc.useDelimiter(".");
	System.out.println(sc.hasNextLine());
	System.out.println(sc.delimiter());
	sc.close();
}
}