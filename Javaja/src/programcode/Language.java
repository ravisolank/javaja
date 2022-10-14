package programcode;

public class Language {
	String name;
	 public void show()
	{
	System.out.println("this is a Language");
	}
}
 class ProLanguage extends Language
{
	public void win()
	{
		System.out.println("this is a ProLanguage");
	}
}
class Java1 extends ProLanguage
{
	{
		System.out.println("It is a top 1 programing Language");
	}
	public static void main(String[]arsg)
	{
	Java1 n=new Java1();
	n.name="hindi";
	System.out.println("Language name is "+n.name);
	n.win();
	n.show();
	ProLanguage k=new ProLanguage();
	k.win();
	k.show();
	Language m=new Language();
	
	k.show();
	
	}
}
