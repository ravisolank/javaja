package programcode;

public class Employee extends Human
{
String empid;
String designation;

Employee(String empid,String designation,int age,String name)
{
	super(name);
	this.empid=empid;
	this.designation=designation;

}
    void show()
    {
   
    	System.out.println("Name is the "+name);
    	System.out.println("Age is the "+age);
    	System.out.println("Empid is the "+empid);
    	System.out.println("Designation is the "+designation);
    	
    	
    }
}

