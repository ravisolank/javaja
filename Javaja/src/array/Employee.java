package array;

public class Employee 
{
int empid;
String name;
String post;

public Employee(int empid,String name,String post)
{
	super();
	this.empid=empid;
	this.name=name;
	this.post=post;
}
//override
public String toString()
{
	return "Employee [empid="+empid+", name="+name+", post="+post+"]";
}

}

