package programmingclass;


//wjp to read two integer value from the user and print those two integers are equal or not.//

import java.util.Scanner;

public class EqualNotEqual 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the integer value : ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	
	if(x==y)
	System.out.println(x+"is equal of "+y);
	
	else
		System.out.println(x+"in not equal of "+y);
	
		
			
}
}
