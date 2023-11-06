// Array another method of initialization

import java.util.Scanner;
 class array
{
	public static void main(String ar[])
	{
		int array[]=new int[5];
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		array[0]=a;
		System.out.println(array[0]);
	}
}