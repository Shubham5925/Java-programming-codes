import java.util.Scanner;
class vowels
{
	public static void main(String args[])
	{
		char ch;
		Scanner r=new Scanner(System.in);
		System.out.print("enter the character");
		ch=r.next().charAt(0);
		if(ch=='a'  ||  ch=='e' || ch=='i'  || ch=='o' || ch=='u')
		{
			System.out.print("vowels");
		}
		else
		{
			System.out.print("consonant");
		}
		
		
	}
}