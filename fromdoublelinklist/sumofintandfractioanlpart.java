package fromdoublelinklist;
import java.util.*;
public class sumofintandfractioanlpart {
   public static void main(String[] args) {
	

    
        double number =  2.3;
        int integral = (int) number;
        double f=(number-integral);
        double a=Math.abs(f);
      System.out.println(f);
        double fractional =(int)Math.round((number-integral)*Math.pow(10, 7));
     
       double sum=0;
       sum=sum+integral+a;
        System.out.println(sum);
    }
}
