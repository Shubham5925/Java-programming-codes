//Single level Inheritence
//hierchial level inheritence
/*class a
{
	 void fun1()
	{
		System.out.println("Message from parent class a");
	}
}
class b extends a
{
	void fun2()
	{
		System.out.println("Message from derived class b");
	}
}
class c extends b
{
	void fun3()
	{
		System.out.println("Message from class c");
	}
}
class demo
{
	public static void main(String ar[])
	{
		b obj1=new b();
		obj1.fun2();
		obj1.fun1();
		a.fun1();
	}
}
*/


/*
//Constructor 1-default/no prameterized constructor 2-argument 3-copy are parameterized constructor....

class a
{
	int height;
	int width;
	a()		//default constructor or non prameterized constructor
	{
		height=10;
		width=20;
	}
	void input(int h,int w)
	{
		height=h;
		width=w;
	}
	void display()
	{
		System.out.println("Height:"+height);
		System.out.println("Width:"+width);
	}
	public static void main(String ar[])
	{
		a obj1=new a();
		obj1.input(20,30);
		obj1.display();
	}
}

*/




import javax.swing.*;    
 class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Click Here");  
    b.setBounds(100,100,95,30);  
    f.add(b);  
    f.setSize(800,800);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  



	

		