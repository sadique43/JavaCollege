package fromrecursion;

import java.util.Scanner;

public class Towersionrevision {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the no. of disks you want to have in the tower of hanoi");
	n=sc.nextInt();
	char from='a';
	char to='c';
	char aux='b';
	towerHanoi(n,from,to,aux);
}
public static void towerHanoi(int n,char from,char to,char aux)
{
	if(n==1) {
		System.out.println("move disk"+" "+n+" "+"from rod"+" "+from+" "+"to rod"+" "+to);
	return;
	}
	towerHanoi(n-1,from,aux,to);
	System.out.println("move disk"+" "+n+"from disk"+" "+from+" "+"to disk"+" "+to);
	towerHanoi(n-1,aux,from,to);
}
}

