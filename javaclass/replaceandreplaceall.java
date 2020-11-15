package javaclass;

public class replaceandreplaceall {
public static void main(String[] args) {
	String str=new String("hmmmmm bees are coming go get them all");
	System.out.println(str.replace('e','u'));//replace() replaces all occurances of old character with new charcter
	System.out.println(str.replaceAll("bees", "kaliya"));//replaces all occurences of old string with new string
}
}
