package mathodShadowing;

public class X 
{
static void p()
{
	System.out.println("x class print");
}
}
 
class Y extends X
{
	static void p()
	{
		System.out.println("Y class print");
	}
}