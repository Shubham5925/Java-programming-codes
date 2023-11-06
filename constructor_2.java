class Box
{
	int height,width;
	String color;
	Box(int h,int w,String c)  //Argument Constructor {because argument is passed}
	{
		height=h;
		width=w;
		color=c;
	}
	void input(int a,int b,String c)
	{
		height=a;
		width=b;
		color=c;
	}
	void display()
	{
		System.out.println("Height"+height+"width"+width+"color"+color);
	}
	public static void main(String ar[])
	{
		Box b1=new Box(11,22,"Blue"); //argument passed when box is created
		b1.display();
		b1.input(100,200,"white");
		b1.display();
	}
}
	