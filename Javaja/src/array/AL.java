package array;
import java.util.ArrayList;
import java.util.Iterator;
public class AL 
{
	public static void main(String[]args)
	{
	
ArrayList<Object>ob=new ArrayList<Object>();
	ob.add(100);
	ob.add("java");
	ob.add(123);
	ob.add('p');
	ob.add("btm");
	ob.add(100);
	Iterator<Object> i=ob.iterator();
	while(i.hasNext()==true)
	{
		System.out.println(i.next());
		
	}
//System.out.println(i.next());
}}