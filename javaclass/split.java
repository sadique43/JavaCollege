package javaclass;

public class split {
public static void main(String[] args) {
	String str=("Hello-iter-you-literally-fckd-me-up");
	String arrOfStr[]=(str.split("-", 6));
	int i=1;
	for(String a : arrOfStr)
	{
		System.out.println(i+")"+a);
	i++;
	}
}
}
