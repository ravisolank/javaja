package programcode;




public class Apple extends Fruit  {
	void showApple()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		Apple a=new Apple();
		a.showFruit();
		a.showApple();
		a.colour="red";
		a.price=150f;
		System.out.println(a.colour);
		System.out.println(a.price);
		
		
		
		
	}

}
