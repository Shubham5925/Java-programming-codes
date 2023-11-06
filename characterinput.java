import java.util.Scanner;
class characterinput
{
	public static void main(String args[])
	{
		char n;
		Scanner r=new Scanner(System.in);
		System.out.print("enter the name");
		n=r.next().charAt(0);
		System.out.print(n);	
	}
}