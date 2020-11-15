package fromdoublelinklist;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regex1 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
String[] s=new String[3];
for(int i=0;i<3;i++)
{
	System.out.println("enter the name");
	s[i]=sc.next();
}

	Pattern p=Pattern.compile("An(gie|jie|gy).*");
	
	for(String temp:s)
	{
		if(p.matcher(temp).lookingAt())
			System.out.println(temp);
	}

	

}
}
