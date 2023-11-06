import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a,b;
		System.out.print("swapping values");
		Scanner r=new Scanner(System.in);
		System.out.print("enter the value of a");
		a=r.nextInt();
		System.out.print("enter the value of b");
		b=r.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a);
		System.out.print(b);
	}

	
}