package programmingclass;

import java.util.Scanner;

public class NegativePositive 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the integer value :  ");
	int x=sc.nextInt();
	
	
	if(x<0)
		
	System.out.println(x +"is negative");
	
	else
		
		System.out.println(x +"is positive");		
			
}
}
