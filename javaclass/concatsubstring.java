package javaclass;

public class concatsubstring {
public static void main(String[] args) {
	String str1=new String("i will find you.");
	String str2=new String("i will surely boom you up");
	String a=str1.substring(0,5);
	String b=str2.substring(1,7);
	System.out.println(a.concat(b));
}
}
