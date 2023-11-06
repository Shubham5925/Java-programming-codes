//2- multi-level inheritence  

class A
{
	void show1()
	{
		System.out.println("method from class A");
	}
}

class B extends A                   //only A and B D.M +M.F gets called
{
	void show2()
	{
		System.out.println("method from class B");
	}
}

class C extends B                  //only A &B&C all three DM+MF gets called
{
	void show3()
	{
		System.out.println("method from class C");
	}
}

class demo
{
	public static void main(String ar[])
	{
		B obj=new B();
		obj.show2();
		obj.show1();
		C obj2=new C();
		obj2.show2();
	}
}