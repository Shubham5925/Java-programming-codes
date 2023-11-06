class b2
{
	int height;               // Data Member-3 :-height ,width,color
	String color;
	int width;
	
	void input(int h,String c,int w)           //Local Variable -h,c,w only accessed in there functions
	{
		height=h;
		color=c;
		width=w;
	}
	void show()                                           // Memebrs- 2- input,show
	{
		System.out.println("Height:"+height);
		System.out.println("Width:"+width);
		System.out.println("Color:"+color);
	}
	public static void main(String ar[])
	{
		b2 obj1=new b2();                              //object 1 created
		obj1.input(100,"red",200);
		obj1.show();
		
		b2 obj2=new b2();                             //object 2 created
		obj2.input(1,"blue",2);
		obj2.show();
	}
}