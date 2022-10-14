package programmingclass;

import java.util.Scanner;

public class MultiFunction 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two Integer : ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	
	System.out.println(x+"+"+y+"="+(x+y));
	System.out.println(x+"-"+y+"="+(x-y));
	System.out.println(x+"*"+y+"="+(x*y));
	
}
}
