/*To print even number in between inputed cmd number i.e n1->n2*/
class even
{
	public static void main(String ar[])
	{
		int n1=Integer.parseInt(ar[0]);
		int n2=Integer.parseInt(ar[1]);
		for(int i=n1;i<=n2;i++)
		{
			/*if(i%2==0)
			System.out.println(i);*/
			
			while(n1<=n2)
			{
				if(n1%2==0)
				System.out.println(n1);
				n1++;
			}
		}
	}
}