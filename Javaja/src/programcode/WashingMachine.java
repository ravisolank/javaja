package programcode;

 class WashingMachine extends Appliances
{
String capacity;
String type;
 WashingMachine(String capacity,String type,double price,String brand,String color)
 {
 super(price, brand,color);
 this.capacity=capacity;
 this.type=type;
}
void display()
{

	System.out.println("Product is price "+price);
	System.out.println("Product is brand "+brand);
	System.out.println("Product is color "+color);
	System.out.println("Product is capacity "+capacity);
	System.out.println("Product is type "+type);
}
}