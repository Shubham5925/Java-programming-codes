/*method overloading sequence changing 1-no of arguments */
class method
{
	void sum(int a,int b)
	{
		int s=a+b;
		System.out.println("Sum is:"+s);
	}
	void sum(int a,int b,int c)
	{
		int s=a+b+c;
		System.out.print("Sum is:"+s);
	}
	public static void main(String ar[])
	{
		method obj=new method();
		obj.sum(10,20);
		obj.sum(11,22,33);
	}
}
	
