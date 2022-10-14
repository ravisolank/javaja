package programmingclass;

import java.util.Scanner;

public class MainPolindrum 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value : ");
	int x=sc.nextInt();
	boolean rs=isPolindrum(x);
	if(rs==true)
		System.out.println("it is polindrum");
	else
		System.out.println("it is not polindrum");
}
static boolean isPolindrum(int x)
{
	int poli=0;int t=x;
	while(x!=0) 
	{
		int d=x%10;
	poli=poli*10+d;
	x=x/10 ;
}
if(t==poli)
	return true;
else
	return false;
}
}
																					