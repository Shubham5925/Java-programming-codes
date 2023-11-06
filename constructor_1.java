/*constructor-
1-same name as class name
2-automatically initialized as object is created
3-used because if user does not give value to funt. so it gives by default values through constructor*/


class b2
{
	int height;             //data members
	int width;
	String color;
	
	void input(int h,int w,String c)        //local variables
	{
		height=h;
		width=w;
		color=c;
	}
	void show()
	{
		System.out.println("Height:"+height);
		System.out.println("Width:"+width);
		System.out.println("Color:"+color);
	}

	b2()             //1-Default Constructor or non parameterized constructor(no parameter passed)
	{
		height=0;	
		width=0;
		color="white";
	}
	
	public static void main(String ar[])
	{
		b2 obj1=new b2();                     //object created 'constructor' automaticaly initialized
		obj1.show();

		b2 obj2=new b2();
		obj2.show();                               //firstly constructor is initialized automatically
		obj2.input(100,200,"Bule");    //again all values changed as user called input
		obj2.show();                              //output shows last assigned value
	}
}