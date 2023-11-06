//3-Multiple Level Inheritence (Java Does not support ) same property gets transferred

//4-Hierchial Inheritence


class A                              //This base class gets extends to both derived classes B and C
{
	void fun1()
	{
		System.out.println("Method from class A");
	}
}

class B extends A
{
	void fun2()
	{
		System.out.println("Method from class B");
	}
}

class C extends A
{
	void fun3()
	{
		System.out.println("Method from class C");
	}
}

class demo
{
	public static void main(String ar[])
	{
		B obj1=new B();             //only DM+MF of class A & B
		obj1.fun1();
		obj1.fun2();
		
		C obj2=new C();             //only DM+MF of class A & C
		obj2.fun1();
		obj2.fun3();
	}
}