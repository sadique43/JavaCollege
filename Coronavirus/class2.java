package Coronavirus;
import java.util.*;
import java.util.ArrayList;

public class class2 {
	String name;
	int age;
	String college;
	String course;
	String address;
	class2(String name,int age,String college,String course,String address)
	{
		this.name=name;
		this.age=age;
		this.college=college;
		this.course=course;
		this.address=address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 obj=new class2("Sadqiue",20,"iter","btech","bsr");
		System.out.println(obj);//by default tostring() method is implemented
		String s=new String("sadique");//here we have override4d the toString()
		System.out.println(s);
		Integer i=new Integer(20);
		System.out.println(i);
		ArrayList l=new ArrayList();
		l.add("iter");
		l.add("btech");
		System.out.println(l);

	}

}
