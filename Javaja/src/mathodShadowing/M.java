package mathodShadowing;

public class M 
{
void add()
{
	System.out.println("m class is print");
	
}
}
 class N extends M
 {
	 void add()
	 {
		 System.out.println("n class is print");
			 
	 }
 }