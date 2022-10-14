package programcode;

public interface SwitchIF 
{
	void SwitchOn();
	void SwitchOff();
}

 class bulb$ implements SwitchIF
{
	String brand;
	float price;


public bulb$(String brand,float price)
{
	super();
	this.brand=brand;
	this.price=price;
}
public void SwitchOn()
{
	System.out.println("name of the child class");
	System.out.println(brand+" "+"bulb produces light");
		
}
public void SwitchOff()
{
	System.out.println("given implemantation for switchOff method");
	System.out.println("bulb is turn off");
		
}

}
