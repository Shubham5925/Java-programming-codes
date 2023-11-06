//status-success
//3-copy constructor or parameterized constructor
class box
{
	int height,width;   //data member
	box(int h,int w)  //argument constructor 
	{
		height=h;
		width=w;
	}
	box(box temp)    //copy constructor
	{
		height=temp.height;
		width=temp.width;
	}
	void show()
	{
		System.out.println("height:"+height+"width:"+width);
	}
	public static void main(String ar[])
	{
		box obj1=new box(11,22);    //firstly it call default constructor as 0 argument
		obj1.show();                            //otherwise in box we passed the object name
		box obj2=new box(obj1);
		obj2.show();
	}
}
		