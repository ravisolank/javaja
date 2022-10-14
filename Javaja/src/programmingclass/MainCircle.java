package programmingclass;

public class MainCircle 
{

public static void main(String[]args)
{
	double ar=getArea(3.8);
	System.out.println("Area of 3.8 radias circle is "+ar);
	  
	double rad=8.7;
	ar=getArea(rad);
	
	System.out.println("Area of "+rad+  +ar);
	
}
static double getArea(double r)
{
	double area=3.143*r*r;
	return area;

}
}
