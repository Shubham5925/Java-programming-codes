import java.util.Scanner;
class naturalnumber
{
	public static void main(String args[])
	{
		int n;
		Scanner r=new Scanner(System.in);
		System.out.print("enter the number");
		n=r.nextInt();
		for(int a=1;a<=n;a++)
		{
			System.out.print(a + " *");
		}	
	}
}