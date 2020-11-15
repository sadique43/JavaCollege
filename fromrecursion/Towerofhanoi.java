package fromrecursion;

import java.util.Scanner;
public class Towerofhanoi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter number of disks you want to have in the tower of hanoi");
	n=sc.nextInt();
	char from='a';
	char to='c';
	char aux='b';
	towerOfHanoi(n,from,to,aux);
}
public static void towerOfHanoi(int n,char from,char to,char aux)
{
	if(n==1)
	{
		System.out.println("move disk"+" "+n+" "+"from rod"+" "+from+" "+"to rod"+" "+to);
		return;//return here is terminating the program
	}

towerOfHanoi(n-1,from,aux,to);
System.out.println("mov disk"+" "+n +" "+"from rod"+" "+from+" "+"to rod"+" "+to);
towerOfHanoi(n-1,aux,to,from);
}
}
