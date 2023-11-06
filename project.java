import java.util.Scanner;
class project
{
	public static void main(String args[])
	{
		int a,b,ch,price;
		Scanner r=new Scanner(System.in);
		System.out.print("enter any string-");
		String str=r.nextLine();
		System.out.print("enter the product price -");
		price=r.nextInt();
		String st="laptop";
		
		if(st=="laptop")
		{
			a=(price*28)/100;
			System.out.print("CGST"+a/2);
			System.out.print("SGST"+a/2);	
			System.out.print(a);
		}
		else
		{
			System.out.print("failed");
		}
	}
}
		
		