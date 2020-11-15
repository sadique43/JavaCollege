package Coronavirus;

import java.util.HashMap;
import java.util.Map;

public class class4 {
	
		

		String name;
		int id;
		class4(String name,int id)
		{
			this.name=name;
			this.id=id;
		}
		//override
		public boolean equals(Object obj)
		{
			if(this==obj)//if both the object references are referring to the same obj
				return true;
			if(obj==null || obj.getClass()!=this.getClass())
				return true;
			class4 objit=(class4)obj;//type casting of argumnet
			return (objit.name.equals(this.name) && objit.id==this.id);
			
		}
		
	}
class soa
{
	public static void main(String[] args) {
	class4 obj1=new class4("sadique",1);
	class4 obj2=new class4("sadique",1);
	Map<class4,String>map=new HashMap<class4,String>();
	map.put(obj1,"cat");
	for(class4 it : map.keySet())
	{
		System.out.println(map.get(it).toString());
	}
	}
}


