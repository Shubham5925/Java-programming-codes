class pattern
{
	public static void main(String ar[])
	{
		System.out.print("hello");

		 int x,y,z,s,t,u,v,w,d,c;
		for(x=1;x<=5;x++)
		{
			System.out.println("");
			for(y=1;y<=x;y++)
			{	
				System.out.print(y);
			}
			for(z=6-x;z>=1;z--)
			{
				System.out.print(" ");
			}
			for(s=1;s<=6-x;s++)
			{
				System.out.print(" ");
			}
			for(t=x;t>=1;t--)
			{
				System.out.print(t);
			}
		}
		for(x=1;x<6;x++)
		{
			System.out.println("");
			for(u=1;u<=6-x;u--)
			{
				System.out.print(u);
			}
			for(v=1;v<=x;v++)
			{
				System.out.print(" ");
			}
			for(w=1;w<=x;w++)
			{
				System.out.print(" ");
			}
			for(d=5;d>=x;d--)
			{
				System.out.print(d);
			}
		}
	
		
	}
}