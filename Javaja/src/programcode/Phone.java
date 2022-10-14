package programcode;

public class Phone
{
static void use()
{
	System.out.println("phone is using only calls");
	

}

}

class IPhone extends Phone
{
	static void use()
	{
		System.out.println("smartphone is use for calling");
		System.out.println("smartphone is use for video call");
		System.out.println("smartphone is use for chatting");
		
	}
}
