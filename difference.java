class diff
{
	public static void main(String ar[])
	{
		int n1=Integer.parseInt(ar[0]);
		int n2=Integer.parseInt(ar[1]);
		if(n1>n2)
		{
			System.out.print("difference is"+(n1-n2));
		}
		else
		{
			System.out.print("difference is"+(n2-n1));
		}
	}
}