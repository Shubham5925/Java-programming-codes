import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		
		int a,b,ch;
		Scanner r=new Scanner(System.in);
		System.out.print("enter the a");
		a=r.nextInt();
		System.out.print("enter the b");
		b=r.nextInt();
		System.out.print("1-addition");
		System.out.print("2-subtraction");
		System.out.print("3-multiplication");
		System.out.print("4-division");
		ch=r.nextInt();
		if(ch==1)
		{
			System.out.print("addition"+(a+b));
		}
		else if(ch==2)
		{
			System.out.print("subtraction"+(a-b));
		}
		else if(ch==3)
		{
			System.out.print("multiplication"+(a*b));
		}
		else if(ch==4)
		{
			System.out.print("division"+(a/b));
		}
	}
}
		