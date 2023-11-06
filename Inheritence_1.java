/*Inheritence : transfering properties from one unit to another unit .It can be done using Extends keyword
syntax: class derived class extends base class
	{
	
	}


Types of Inherietence
1-single level inheritence- exactly 2
2-multilevel- more than 2
3-multiple level- (java doest support)
4-hierchial level
5-hybrid level

class A-base class/parent class/super class
class B-derived class /child class/sub class

*/

//1-single level inheritence

class A
{
	void show()
	{
		System.out.println("method of base class/parent class/super class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("method of derived class/child class/sub class");
	}
}

class demo
{
	public static void main(String ar[])
	{
		B b2=new B();     //always create object of derived/child/sub class so=B
		b2.show();
		b2.display();
		
	}
}
















