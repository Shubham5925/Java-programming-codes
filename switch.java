import java.util.Scanner;
class witch
{
	public static void main(String args[])
	{
		int ch;
		Scanner r=new Scanner(System.in);
		ch=r.nextInt();
		Switch(ch);
		{
			case 1 : System.out.print("hi");			
				break;
			case 2 :System.out.print("hello");
				break;
			default : System.out.print("failed");
		}
	}
}
				