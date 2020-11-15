package midsem;

public class q3 {
public static void main(String[] args) {
	String str1=new String("sadique akhtar is a good master");
    boolean v=true;
    char ch[]=str1.toCharArray();
    for(int i=0;i<str1.length();i++)
    {
    	if(i==0 && ch[i]!=' ')
    	{
    		if(ch[i]>='a' && ch[i]<='z')
    		{
    			ch[i]=(char)(ch[i]- 'a' + 'A');
    		}
    	}
    	if(ch[i]==' ' && ch[i+1]!=' ')
    	{
    		ch[i+1]=(char)(ch[i+1]- 'a' + 'A');
    	}
    }
    
    	String str=new String(ch);
    	System.out.println(str);
}
}
