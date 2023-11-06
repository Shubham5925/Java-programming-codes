import java.util.Scanner;
class oddeven
{
	public static void main(String args[])
	{
		int n;
		Scanner yes=new Scanner (System.in);
		System.out.print("enter the number");
		n=yes.nextInt();
		if(n%2==0)
		{
			System.out.print("is even");
		}
		else
		{
			System.out.print("is odd");
		}
		
	}
}