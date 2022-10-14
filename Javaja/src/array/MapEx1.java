package array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MapEx1 
{
public static void main(String[]args)
{
	HashMap<String,Object>hm=new HashMap<String,Object>();
	hm.put("pbno", 896987343l);
	hm.put("name","riyas");
	hm.put("state","Karnataka");
	hm.put("pin","12345");
	System.out.println(hm);
	
	hm.put("name","salman");
	System.out.println(hm);
	hm.put("state","Andra");
	System.out.println(hm);
	hm.put(null,"nuthing");
	hm.put("email",null);
	System.out.println(hm);
	System.out.println(hm.entrySet());
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.containsKey("pin"));
	System.out.println(hm.containsValue("Karnataka"));
	System.out.println(hm.get("Kashmir"));
	
	Set s=hm.entrySet();
	System.out.println(s);
	System.out.println("printing using itr");
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	
	
}
}
