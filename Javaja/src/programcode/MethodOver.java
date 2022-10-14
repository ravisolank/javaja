package programcode;

public class MethodOver
{
public static void main(String[]arz)
{
	add();
	add(100,200);
	add(100,200,300);
	add(400f,200f);
}
public static void add()
{
	System.out.println("method with no arguments");
	
}
public static void add(int a,int b)
{
	System.out.println(a+b);
}

public static void add(int a,int b,int c)
{
	System.out.println(a+b+c);
}
public static void add(float a,float b)
{
	System.out.println(a+b);
}
}