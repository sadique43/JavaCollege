package javaclass;

import java.util.StringTokenizer;

public class Stringtokenizer {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("hello iter how are u");
	while(st.hasMoreTokens())
	{
		System.out.println("token:"+st.nextToken());
	}
	
}
}
