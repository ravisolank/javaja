package programmingclass;
import java.util.Scanner;
public class BiggestNumber
{


public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the three integer values : ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	
	int big=x;
	
	if(big<y)
		big=y;
	if(big<z)
		big=z;
	
	System.out.println("Biggest is: "+big);
}
}
