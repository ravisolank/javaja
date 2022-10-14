package programcode;

public class Student extends Human
{
String sid;
String stream;
Student(String sid,String stream, int age,String name)
{
	super(age,name);
	this.sid=sid;
	this.stream=stream;
	
}
void printStudent()
{
	System.out.println("Student id "+sid);
	System.out.println("Name is the "+name);
	System.out.println("Age is the "+age);
	System.out.println("stream is "+stream);
}
}


