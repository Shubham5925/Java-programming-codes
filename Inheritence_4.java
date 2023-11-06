//5- Hybrid Inheritence-----/*1-single + multi level   Inheritence
		             // 2-multi + hierchial level   Inheritence
                                                 //3- hierchial +single level Inheritence 
			//and more combinations from it.*/

// 2-  multi + Hierchial Inheritence


class A
{
	void fun1()
	{
		System.out.println("Method from base class A");
	}
}

class B  extends A                 //multi level
{ 
	void fun2()
	{
		System.out.println("Method from class B");
	}
}

class C extends B                  //multi level
{
	void fun3()
	{
		System.out.println("Method from class C");
	}
}

class D extends C             //hierchial level (now class C becomes base class)
{
	void fun4()
	{
		System.out.println("Method from class D");
	}
}

class E extends C               //hierchial level (class C becomes base class)
{
	void fun5()
	{
		System.out.println("Method from class E");
	}
}


class demo
{
	public static void main(String ar[])
	{
		B obj1=new B();            //DM + MF of A & B       multi level
		obj1.fun1();
		obj1.fun2();
	
		C obj2=new C();            // DM + MF of B & C      multi level
		obj2.fun2();
		obj2.fun3();

		D obj3=new D();           // DM + MF of C & D      hierchial
		obj3.fun3();
		obj3.fun4();

		E obj4=new E();            //DM + MF of C & E        hierchial
		obj4.fun3();
		obj4.fun5();
	}
}

	
	
	