package fromdoublelinklist;

import java.util.Scanner;

public class vowels {
public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			String str;
			System.out.println("enter a string");
			str=sc.nextLine();
			int count;
			char string[]=str.toCharArray();
			int n=str.length();
			int freq[]=new int[n];
		    for(int i=0;i<str.length();i++)
		    {
		    	freq[i]=1;
		    	for(int j=i+1;j<str.length();j++)
		    	{
		    		if(string[i]==string[j])
		    		{
		    			freq[i]++;
		    			string[j]='0';
		    		}
		    	}
		    }
		    for(int i=0;i<freq.length;i++)
		    {
		    	if(string[i]!=' ' && string[i]!='0')
		    		System.out.println(string[i]+"-"+freq[i]);
		    }
		    	
		 
		}
		}
