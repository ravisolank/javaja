
package array;



//wjp to read row size & column size from dynamically & initialization array dynamically.//

import java.util.Scanner;

public class MatrixScanner 
{
public static void main(String[]arz)
{
	Scanner s=new Scanner(System.in);// dynamic reading part
	System.out.println("enter row size");
	int row=s.nextInt();
	System.out.println("enter column size");
	int col=s.nextInt();
	int a[][]=new int [row][col];   // array declaration 
	
	
		for(int r=0;r<row;r++)//reading purpose
		{
			for(int c=0;c<col;c++)
			{
			a[r][c]=s.nextInt();
			}
		}

		for(int i=0;i<row;i++)//printing purpose
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(a[i][j]+"  ");
			}
			
		System.out.println();
			{
		
			}
		}
	}
	
}

