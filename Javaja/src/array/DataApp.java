package array;

import java.util.Scanner;

public class DataApp
{

	public static void main(String[]args)
	{  
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age ");
		int age=s.nextInt();
		DataApp ob=new DataApp();
		
		try
		{
			ob.checkAge(age);
			
		}
		catch(CustomException e)
		{
			
		}
		finally 
		{
			System.out.println("okay");
			
		}
	}
		public void checkAge(int age)
		{
			if(age<21)
				throw new CustomException("Age is invalid");
			else 
				System.out.println("go further");
		}
		
		
	}
	

