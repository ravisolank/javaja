package array;
import java.util.Scanner;
public class DemoMatrix
{
public static void main(String[]arx)
{
	Scanner S=new Scanner(System.in);//dynamically reading part
	System.out.println("Enter row size");
	int row=S.nextInt();
	System.out.println("Enter column size");
	int col=S.nextInt();
	
	int a[][]=new int[row][col];//array declaration
	for(int r=0;r<row;r++) //reading purpose
	{
		for(int c=0;c<col;c++)
		{
			a[r][c]=S.nextInt();
		}
		}
	for(int i=0;i<row;i++)//printing purpose
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(a[i][j]+"     ");
		}
		{
			System.out.println();
		}
	}
	}
}
