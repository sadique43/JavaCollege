package fromrecursion;

import java.util.Scanner;

public class equals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1,str2;
	System.out.println("enter the first string");
	str1=sc.nextLine();
	System.out.println("enter the second string");
	str2=sc.nextLine();
	System.out.println(str1.equals(str2));
	if (!str1.equals(str2))
		System.err.println("equals() correctly reports false");
		else
		System.err.println("equals() incorrectly reports true");
		if (str1.equalsIgnoreCase(str2))
		System.err.println("equalsIgnoreCase() correctly reports true");
		else
		System.err.println("equalsIgnoreCase() incorrectly reports false");
}
}
