package sadique1;

import java.util.Scanner;

public class charInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.println("enter the character");
	ch=sc.next().charAt(0);//character input in java
	System.out.println(ch);
}
}
