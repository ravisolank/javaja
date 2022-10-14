//wjp to read three double type values from the user and print biggest among.//

package programmingclass;



import java.util.Scanner;
public class BiggestThree
{
public static void main(String[]args)
{
	Scanner a=new Scanner(System.in);
	System.out.println("enter the three double  values : ");
	double x=a.nextDouble();
    double y=a.nextDouble();
	double z=a.nextDouble();
	
	double big=x;
	
	if(big<y)
		big=y;
	
	if(big<z)
		big=z;
	System.out.println("Bigger is : "+big);
}

}
