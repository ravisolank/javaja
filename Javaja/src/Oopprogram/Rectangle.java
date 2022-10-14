package Oopprogram;

public class Rectangle 
{
private int length=30;
private int breadth=40;
void Retangle(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
	
}
public void setLength(int length)
{
	this.length=length;
	
}
public int getLength()
{
	return length;
}
public int getBreadth()
{
	return breadth;
	
}
public void setBreadth(int breadth)
{
	this.breadth=breadth;
}
void display()
{
System.out.println("Area is");
int area=length*breadth;
System.out.println(area);

}
}
