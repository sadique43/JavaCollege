package fromdoublelinklist;

public class generalrough {
public static void main(String[] args) {
	String str="sadique is a good boy";
	char ch[]=new char[str.length()];
	int i=0;
	int a[]=new int[str.length()];
	a[i]=1;
	while(i<str.length())
	{
		if(ch[i]==' ')
		{
			a[i]=1;
		}
		else if(ch[a[i-1]]!=' ')
		{
			ch=str.toUpperCase().toCharArray();
		}
		i++;
	}
	System.out.println(str);
    
}
}
