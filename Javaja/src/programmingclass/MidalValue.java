package programmingclass;

class MidalValue{
public static void main(String[]args)
{
	getMidalValue(10,20,30);
}
static int getMidalValue(int x,int y,int z)
{
	
	if(x>y&&x<z||x>z&&x<y) 
		return x;
	
	else if(y>x&&y<z||y>z&&y<x) 
		return y;
	
	else 
		return z;
	
}
	
}

