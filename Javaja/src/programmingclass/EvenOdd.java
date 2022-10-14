package programmingclass;

// wjp to read print user intracted integer is even or odd.//


import java.util.Scanner;
public class EvenOdd 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the integer values : ");
	int x=sc.nextInt();
	
	if(x%2==0)
		
	System.out.println(x+ "is even number");
	else
		System.out.println(x  + "is odd number");
}
}
