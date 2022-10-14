//wjp to 3 integer value from the user and print Smallest one.//

package programmingclass;
import java.util.Scanner;
public class SmollestOne 
{
public static void main(String[]args)
{
	Scanner c=new Scanner(System.in);
	
	System.out.println("enter the integer values :  ");
	int x=c.nextInt();
	int y=c.nextInt();
	int z=c.nextInt();
	
	int small=x;
	
	if(small>y)
		small=y;
	
	if(small>z)
		small=z;
	
	System.out.println(" Smallest is "+small);
			}
}
