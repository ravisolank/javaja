package programcode;

abstract class VebdingMachine 
{
	abstract void addElements();
	abstract void getDrink();
}

   class Tea extends VebdingMachine 
{
 public void addElements()
 {
	 System.out.println("Add the milk");
	 System.out.println("Add the sugar");
	
 }
 public void getDrink()
 {
	 System.out.println("Add the tea");
 }
}
     class Coffee extends VebdingMachine
{
	public void getDrink()
	{
		System.out.println("Coffee is Ready");
		System.out.println("Add the coffee powder");
		System.out.println("Add the hot water");
	}
	public void addElements()
	{
		System.out.println("Add the hot water");
	}
	
}

