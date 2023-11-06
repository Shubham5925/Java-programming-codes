/* Method overriding- When we use same name method in Base class as well as in Derived 
class then the only derived class content is called ( Loss of Base class content )   is called method 
overriding */

class A
{
	 final void show()         //using Final keyword to restrict overriding 
	{
		System.out.println("Method from class A");
	}
}

class B 
{
	void show()
	{
		System.out.println("Method from class B");
	}
}

class demo
{
	public static void main(String ar[])
	{
		B obj=new B();
		obj.show();
	}
}