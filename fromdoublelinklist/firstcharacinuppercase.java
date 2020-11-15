package fromdoublelinklist;

import java.util.Scanner;

public class firstcharacinuppercase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("enter a string");
	str=sc.nextLine();
	
	char ch[]=str.toCharArray();
	

	
	for(int i=0;i<str.length();i++)
	{
		if(i==0 && ch[i]!=' ' )
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
			ch[i]=(char)(ch[i] - 'a' + 'A');
			}
		}
			 if( ch[i]==' ' && ch[i+1]!=' ')
			{
			//if apart from first character any other character is in upper case then convert it into lower case
				if(ch[i+1]>='a' && ch[i+1]<='z')
				{
				ch[i+1]=(char)(ch[i+1] - 'a' + 'A');
				}
			}
		
				
			
		
		
		
		
	}
	String st=new String(ch);
	System.out.println(st);
		
	}
	

}

