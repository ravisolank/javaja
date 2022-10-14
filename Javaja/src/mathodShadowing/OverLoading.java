package mathodShadowing;

 class A
{
static void exc()
{
	System.out.println("parent class print A");
	
}
}
class B extends A
{
	static void exc()
	{
		System.out.println("child class print B");	
	}
}
