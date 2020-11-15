package Coronavirus;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iter0 obj1=new iter0("an",1);
		iter0 obj2=new iter0("an",1);
		if(obj1.hashcode() == obj2.hashcode())//if hashcodes are equal then andar jaaega...if their address is same whether the values at the address is also same
		{
			if(obj1.equals(obj2))//obj1 use krke equals() fn ko call kiye...to abhi obj1 active hai
				System.out.println("both objects are equal");
			else
				System.out.println("both objects are not equal");
		}
		else
			System.out.println("both obj are not equal");

	}

}


