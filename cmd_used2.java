class abc
{
	public static void main(String ar[])
	{
		int n3;//we need to only make n3 as integer
		int n1=Integer.parseInt(ar[0]);  //Integer is class and parseInt is method 
		int n2=Integer.parseInt(ar[1]);  //here array is of string type so we need to convert this string array into an integer using parseInt() method 
		n3=n1+n2;
		System.out.print("sum is:"+n3);
		//System.out.print(ar[0]);  //taking input through command prompt at index ar[0]
		//System.out.print(ar[1]);  //taking input through command prompt at index ar[1]
	}
}