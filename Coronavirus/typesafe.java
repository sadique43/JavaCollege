package Coronavirus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class typesafe {

	public static void main(String[] args)
	throws Exception{
		// TODO Auto-generated method stub
      try {
    	  List<String> vector = new ArrayList<String>();//creating object of List<String> or typesafe
    	  vector.add("A");
    	  vector.add("B");
    	  vector.add("C");
    	  vector.add("D");
    	  System.out.println("before swap: "+vector);
    	  System.out.println("\n swapping 0th and 4th element");
    	  Collections.swap(vector, 0, 4);
    	  System.out.println("after swap"+vector);
      }
      catch(IndexOutOfBoundsException e)
      {
    	  System.out.println("exception thrown"+e);
      }
	}

}
