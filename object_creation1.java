class box
{
	void show()
	{
		System.out.println("message from a non static member by calling");
	}
	public static void main(String ar[])
	{
		box b1=new box();
		b1.show();
	}
}
		