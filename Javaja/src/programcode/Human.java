package programcode;


public class Human 
{
	String name;
	int age;
	String country;
	
	Human()
	{
		
	}
Human(String name)
{
	this();
	this.name=name;
}
Human(String name,int age)
{
	this(name);
	this.age=age;
}
Human(String name,int age,String country)
{
	this(name,age);
	this.country=country;
}
public static void main(String[] args)
{
 Human a=new Human();
 Human b=new Human("ravi");
 Human c=new Human("ravi",26);
 Human d=new Human("ravi",26,"India");
 System.out.println(b.name);
 

 
}
}

