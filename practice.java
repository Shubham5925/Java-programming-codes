class area
{
	public void fun()
	{
		System.out.print("Displaying area");
	}
}
class triangle extends area
{
	public int shape(int h,int b)
	{
		return (1/2)*(h*b);
	}
}

class demo{

	public static void main (String args[])
	{
		triangle obj=new triangle();
		int res=obj.shape(25,10);
		System.out.print(res);
	
	}
}
