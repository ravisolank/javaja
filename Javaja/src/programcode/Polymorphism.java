package programcode;

public class Polymorphism 
{
	public static void main(String[]arz)
	{
	values("Ravi");
	values("syam",21);
	values("mohit",18,"Gwalior");
	values("Satish","delhi");
}
public static void values(String name)
{
	System.out.println("Employee name is "+name);
}

public static void values(String name,int age)
{
	System.out.println("Employee name is "+name);
	System.out.println("Employee Age "+age);
}
public static void values(String name,int age,String place)
{
	System.out.println("Employee name is "+name);
	System.out.println("Employee Age "+age);
	System.out.println("Employee Place "+place);
}

public static void values(String name,String place)
{
	System.out.println("Employee name is "+name);
	System.out.println("Employee Place "+place);
}
}

