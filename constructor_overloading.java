//constructor overloading
//By changing Signatures
//1-No of argument 2- type of argument 3-sequence of argument

class box
{
	int height,width,breadth;
	String color;
	box(int h,int w,int b)   // No of argument
	{
		height=h;
		width=w;
		breadth=b;
	}
	box(int h,int w,String c)   //Type of argument
	{
		height=h;
		width=w;
		color=c;
	}
	box(int h,String c,int w,int b)   //sequence of argument
	{
		height=h;
		color=c;
		width=w;
		breadth=b;
	}

	void display()
	{
		System.out.println(" Height: "+height+" width: "+width+" Color: "+color+" Breadth "+breadth);
	}

	public static void main(String ar[])
	{
		box b1=new box(11,22,33);  //no of argument
		b1.display();
		box b2=new box(1,2,"Blue");  //type of argument
		b2.display();
		box b3=new box(10,"Red",20,30);  //sequence of argument
		b3.display();
	}
}
		
	
	
	