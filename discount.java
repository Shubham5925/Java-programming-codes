class sample
{
	public static void main(String ar[])
	{
		int price,s;
		int r=Integer.parseInt(ar[0]);
		if(r<1000)
		{
			System.out.print("no discount");
		}
		else if(r<=1000&&r>=0)
		{
			s=(r*10)/100;
			System.out.print("total payable amount is"+(r-s));
		}
		else if(r<=3000 && r>1000)
		{
			s=(r*20)/100;
			System.out.print("total payable amount is"+(r-s));
		}
		else if(r>3000)
		{
			s=(r*30)/100;
			System.out.print("total payable amount is"+(r-s));
		}
		else
		{
			System.out.print("NO DISCOUNT");
		}
				
	}
}
			