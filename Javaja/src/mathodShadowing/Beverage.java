package mathodShadowing;

public class Beverage 
{
void addthings()
{
System.out.println("Items should to prepare a drink");	
}
}

class Shake extends Beverage

{
	void addthings()
	{
	System.out.println("Fruits nuts,milk should added");	
	}
}

class Juice extends Beverage
{
	void addthings()
	{
		System.out.println("Fruits should be added");
	}
}