import java.util.Scanner;
class userinput
{
	public static void main(String args[])
	{
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the value");
		a=obj.nextInt();
		System.out.print("enter the next value");
		b=obj.nextInt();
		System.out.print(a+b);
	}
}