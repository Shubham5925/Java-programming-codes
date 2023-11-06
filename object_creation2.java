class box      //class+class_name
{
	int height;     //data member
	int width;      //data member
	void input(int a,int b)  //non static member
	{
		height=a;
		width=b;
	}
	void show()     //non static member
	{
		//System.out.println("message from a non static member by calling");
		System.out.println("Height:"+height);
		System.out.println("Width:"+width);
	}
	
		
	public static void main(String ar[]) 
	{
		box b1=new box();            //class_name object_name =new class_name()
		b1.input(100,200);           //giving input to input function
		b1.show();                        //non static member calling by object
		
		box b2=new box();          //class_name object_name =new class_name()
		b2.input(10,20);              //giving input to input function
		b2.show();                       //non static member calling by object
	}
}
		