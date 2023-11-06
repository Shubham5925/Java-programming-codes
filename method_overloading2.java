/*method overloading Sequence 2-Type of argument*/
class method
{
	void sum(int n1,int n2)
	{
		int s=n1+n2;
		System.out.println(s);
	}
	void sum(float n1,float n2)
	{
		float s=n1+n2;
		System.out.print(s);
	}
	public static void main(String ar[])
	{
		method r=new method();
		r.sum(11,22);
		r.sum(10.5f,20.60f);      //pre defined suffix 'f' -used to convert double to float data type 
	}
}