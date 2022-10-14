package programcode;

 class Television extends Appliances
{
	double size;
	String type;
	String print;
	
	Television(double size,String type,String print,double price,String brand,String color)
	{
		super(price, brand,color);
		this.size=size;
		this.type=type;
		this.print=print;
	}
	void show()
	{
		System.out.println("Product is price "+price);
		System.out.println("Product is brand "+brand);
		System.out.println("Product is color "+color);
		System.out.println("Product is size "+size);
		System.out.println("Product is type "+type);
		System.out.println("Product is print "+print);
	}
	

}
