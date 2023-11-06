//Constructor in Inheritence--When we extends , the base class constructor is not called and and we create on object of derived class 
//class constructor is called ,so we use super keyword to call constructor of base class......

class A
{
	int height;
	A(int b)
	{
		height =b;
	}
	void show()
	{
		System.out.println("Height:"+height);
	}
}
	
class B extends A
{
	int width;	
	B(int a,int b)
	{
		super(a);   // super method will call base class constructor
		width=b;
	}
	void display()
	{
		System.out.println("Width:"+width);
	}
}
	
class demo
{
	public static void main(String ar[])
	{
		B b1=new b1(10,20);
		b1.display();	
		b1.show();
	}
}
		
	