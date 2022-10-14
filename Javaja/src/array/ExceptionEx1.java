package array;

public class ExceptionEx1  
{
public static void main(String[]args)
{
	int a[]= {123,223,456,789,65};
	System.out.println("printing array elements");
	try
	{
		for(int i=0;i<=a.length;i++);
		{
			System.out.println(a[i]);
		}
		
		}
	Catch(Array Index out of Bounds Exception)
	{
		System.out.println(2);
	}
	System.out.println("Okey");
	}
}

