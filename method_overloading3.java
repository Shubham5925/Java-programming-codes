/*method overloading Sequence 3-sequence of argument*/
class method
{
	void sum(int n1,float n2)
	{
		float s=n1+n2;
		System.out.println(s);
	}
	void sum(float n1,int n2)
	{
		float s=n1+n2;
		System.out.print(s);
	}
	public static void main(String ar[])
	{
		method r=new method();
		r.sum(11,22.5f);
		r.sum(10.5f,20);      //pre defined suffix 'f' -used to convert double to float data type 
	}
}