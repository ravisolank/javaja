package array;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSet1 
{

	
public static void main(String[]args)
{
	// To Do Auto-generated method stub
	HashSet<String>h=new HashSet<String>();
	h.add("Ravi");
	h.add("solanki");
	h.add("Gwalior");
	h.add("Ravi");
	h.add("Madhya pradesh");
	
	System.out.println(h);

	for(String f:h )
	{
		System.out.println(f);
	}
	System.out.println("..............................");
	Iterator<String>a=h.iterator();
	while(a.hasNext()==true)
	{
    System.out.println(a.next());
		
	}
	System.out.println("..............................");
	TreeSet<String>T=new TreeSet<String>(h);
	for(String m:T)
	{
				System.out.println(m);
	}
		//System.out.println("..............................");
	

				
				
		
}
}



