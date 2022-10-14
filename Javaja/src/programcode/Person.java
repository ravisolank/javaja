package programcode;

class Person 
{
String name;
int age;

Person(String name,int age)
{
	this.name=name;
	this.age=age;
	
}
 void display()
{
	System.out.println("name is name "+name);
	System.out.println("Age is "+age);
	
}

}

interface Coarses
{
	static final String Brand="BTM";
	
	public void CoarsesToComplate();
	
}

  class Qstudents extends Person implements Coarses
{
	int qid;
	
	 Qstudents(String name,int age,int qid)
	 {
		 super(name,age);
		 this.qid=qid;
	 }
	 
	 public void CoarsesToComplate()
	 {
		 System.out.println("Qspider student wants to complate");
		 System.out.println("manual testing  complate");
	 }
	 public void printID()
	 {
		 System.out.println("ID is "+qid);
	 }
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
