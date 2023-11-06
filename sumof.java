import java.util.Scanner;
class naturalnumber
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner r=new Scanner(System.in);
		System.out.print("enter the number");
		n=r.nextInt();
		for(int a=1;a<=n;a++)
		{
			sum=sum+a;
		}
		System.out.print(sum);	
	}
}
		