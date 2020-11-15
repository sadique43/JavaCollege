package Coronavirus;
public class class1 {

	String name;
	int age;
	String college;
	String course;
	String address;
	class1(String name,int age,String college,String course,String address)
	{
		this.name=name;
		this.age=age;
		this.college=college;
		this.course=course;
		this.address=address;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj=new class1("sadique",20,"iter","btech","bsr");
		System.out.println(obj);
		System.out.println(obj.toString());

	}

}
