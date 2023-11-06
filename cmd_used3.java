class cmd
{
	public static void main(String ar[])
	{
		int add,sub,mlty,div;
		int n1=Integer.parseInt(ar[0]);
		int n2=Integer.parseInt(ar[1]);
		add=n1+n2;
		sub=n1-n2;
		mlty=n1*n2;
		div=n1/n2;
		System.out.println("Sum of "+n1+" and " +n2+" is :"+add);
		System.out.println("Subtract of"+n1+" and "+n2+" is :"+sub);
		System.out.println("multiply of "+n1+" and "+n2+" is :"+mlty);
		System.out.println("division  of"+n1+" and "+n2+" is :"+div);
	}
}
		
