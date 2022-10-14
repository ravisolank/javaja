package programcode;

abstract class ElectricSwitch
{
	String brand;
	float price;
	
	ElectricSwitch(String brand,float price)
	{
		this.brand=brand;
		this.price=price;
	}

	abstract public void SwitchOn();
	abstract public void SwitchOff();
	}
	class EBulb extends ElectricSwitch
	{
		String bbrand;
		String type;
		EBulb(String brand,float price,String bbrand,String type)
		{
			super(brand,price);
			this.bbrand=bbrand;
			this.type=type;
		}
		public void SwitchOn()
		{
			System.out.println("producing light");
		}
		public void SwitchOff()
		{
			System.out.println("Now the bulb is turned Off");
		
		}
		public void view()
		{
			System.out.println("Brand of the Bulb "+brand);
			System.out.println("Price of the bulb "+price);
			System.out.println("brand of the bbulb "+bbrand);
			System.out.println("Type of the bulb "+type);
		}
		
	}
	


