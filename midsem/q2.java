package midsem;

import java.util.StringTokenizer;

public class q2 {
public static void main(String[] args) {
	String str=new String("hello iter its me");
	//prog to count the frequency of each character present in it
	
	int frequency[]=new int[str.length()];
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		frequency[i]=1;
		for(int j=i+1;j<str.length();j++)
		{
			if(ch[i]==ch[j])
			{
				frequency[i]++;
			
				ch[j]='0';
			}
		}
	}
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]!=' ' && ch[i]!='0')
		System.out.println(ch[i]+"-"+frequency[i]);
	}
}
}
