package fromdoublelinklist;

import java.util.Scanner;

public class commawalawordcount {
public static void main(String[] args) {
	double meal_cost=12.00;
	int tip_percent=20;
	int tax_percent=8;
	tip_percent=(int)(tip_percent/100);
	System.out.println(tip_percent);
	tax_percent=(int)((int)meal_cost*(tax_percent/100));
	System.out.println(tax_percent);
	int total_cost= (int)((double)meal_cost+tip_percent+tax_percent);
	
	System.out.println(total_cost);
}
}
