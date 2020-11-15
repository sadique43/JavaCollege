package javaclass;
//string class  is immutable
public class q1 {
public static void main(String[] args) {
	
String str=new String("hello iter");
str.concat("bye");
System.out.println(str);
//stringBuffer class is mutable(aka changeable)
StringBuffer str1=new StringBuffer("Hello meghnad saha");
str1.append("bye meghnad saha");
System.out.println(str1);



	
}
}
