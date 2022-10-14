package array;
import java.util.ArrayList;
public class Marge
{
public static void main(String[]args)
{
	ArrayList<Object>ar=new ArrayList<Object>();
	ar.add(new Employee(11134,"ravi","manager"));
	ar.add(new Employee(22234,"monu","manager"));
	ar.add(new Employee(33334,"satish","manager"));
	ar.add(new Student(01,"sandeep",87.55f));
	ar.add(new Student(02,"rahul",85.65f));
	
	
	ArrayList<Object>ar2=new ArrayList<Object>();
	ar2.add("gwalior");
	ar2.add(12345);
	System.out.println("index of gwalior is :"+ar2);
	ar2.addAll(ar);
	System.out.println("index of gwalior is :"+ar2);
	
	for(Object f:ar2)
	{
		System.out.println(f);
	}
}
}
